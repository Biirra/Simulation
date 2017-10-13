package nl.janwillemhuising;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import nl.janwillemhuising.controller.BackgroundController;
import nl.janwillemhuising.controller.DebugController;
import nl.janwillemhuising.controller.GameEngine;
import nl.janwillemhuising.model.DebugPanel;
import nl.janwillemhuising.model.Simulation;
import nl.janwillemhuising.view.BackgroundView;
import nl.janwillemhuising.view.DebugView;
import nl.janwillemhuising.view.MainView;


public class Main extends Application {

    AnimationTimer simulationLoop;
    Canvas canvas;
    Scene scene;

    @Override
    public void start(Stage primaryStage) throws Exception {
        // create window
        primaryStage.setTitle("NatureOfCode");
        //primaryStage.getIcons().add(new Image("https://www.shareicon.net/data/64x64/2016/08/22/818801_plant_512x512.png"));
        BorderPane root = new BorderPane();

        //create Canvas
        canvas = new Canvas(Settings.SCENE_WIDTH,Settings.SCENE_HEIGHT);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // create models and views
        DebugPanel debugPanel = createDebugPanel();
        DebugView debugView = new DebugView();
        BackgroundView backgroundView = new BackgroundView(gc);
        Simulation simulation = createWorld();
        MainView mainView = new MainView(gc);

        // create controllers
        BackgroundController backgroundController = new BackgroundController(backgroundView);
        DebugController debugController = new DebugController(debugPanel, debugView);
        GameEngine gameEngine = new GameEngine(simulation, mainView);

        final long startNanoTime = System.nanoTime();
        //-----------------------------
        // Application Loop
        //-----------------------------
        simulationLoop = new AnimationTimer(){
            @Override
            public void handle(long currentNanoTime) {
                double t = (currentNanoTime - startNanoTime) / 1000000000.0;
                debugController.update(currentNanoTime);
                backgroundController.update(t);
                gameEngine.update();
            }
        };
        simulationLoop.start();


        // add canvas to window
        root.getChildren().add(canvas);

        // add debug panel to window
        root.setCenter(debugView.getDebugView());

        // set scene and create
        scene = new Scene(root, Settings.SCENE_WIDTH, Settings.SCENE_HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public Simulation createWorld(){
        return new Simulation();
    }

    public DebugPanel createDebugPanel(){
        return new DebugPanel();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
