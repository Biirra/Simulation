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
import nl.janwillemhuising.controller.DebugController;
import nl.janwillemhuising.controller.GameEngine;
import nl.janwillemhuising.model.DebugPanel;
import nl.janwillemhuising.model.Simulation;
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
        primaryStage.getIcons().add(new Image("https://www.shareicon.net/data/64x64/2016/08/22/818801_plant_512x512.png"));
        BorderPane root = new BorderPane();

        //Canvas
        canvas = new Canvas(Settings.SCENE_WIDTH,Settings.SCENE_HEIGHT);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        root.getChildren().add(canvas);

        Pane layerPane = new Pane();

        DebugPanel debugPanel = createDebugPanel();
        DebugView debugView = new DebugView();
        Simulation simulation = createWorld();
        MainView mainView = new MainView(gc);

        DebugController debugController = new DebugController(debugPanel, debugView);
        GameEngine gameEngine = new GameEngine(simulation, mainView);

        //-----------------------------
        // Application Loop
        //-----------------------------
        simulationLoop = new AnimationTimer(){
            @Override
            public void handle(long now) {
                debugController.update(now);
                gameEngine.update();
            }
        };
        simulationLoop.start();


        //layerPane.getChildren().add(mainView.getWorldLayer());
        layerPane.getChildren().add(debugView.getDebugView());
        root.setCenter(layerPane);


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
