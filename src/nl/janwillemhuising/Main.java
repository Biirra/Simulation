package nl.janwillemhuising;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import nl.janwillemhuising.controller.Debugcontroller;
import nl.janwillemhuising.controller.GameEngine;
import nl.janwillemhuising.model.DebugPanel;
import nl.janwillemhuising.model.World;
import nl.janwillemhuising.view.DebugView;
import nl.janwillemhuising.view.MainView;


public class Main extends Application {

    AnimationTimer simulationLoop;
    Scene scene;

    @Override
    public void start(Stage primaryStage) throws Exception {
        // create window
        primaryStage.setTitle("NatureOfCode");
        primaryStage.getIcons().add(new Image("https://www.shareicon.net/data/64x64/2016/08/22/818801_plant_512x512.png"));
        BorderPane root = new BorderPane();

        Pane layerPane = new Pane();
        root.setCenter(layerPane);

        DebugPanel debugPanel = createDebugPanel();
        DebugView debugView = new DebugView();
        World world = createWorld();
        MainView mainView = new MainView();

        Debugcontroller debugcontroller = new Debugcontroller(debugPanel, debugView);
        GameEngine gameEngine = new GameEngine(world, mainView);

        //-----------------------------
        // Application Loop
        //-----------------------------
        simulationLoop = new AnimationTimer(){
            @Override
            public void handle(long now) {
                debugcontroller.update(now);
                gameEngine.update();
            }
        };
        simulationLoop.start();


        layerPane.getChildren().add(mainView.getWorldLayer());
        layerPane.getChildren().add(debugView.getDebugView());


        scene = new Scene(root, Settings.SCENE_WIDTH, Settings.SCENE_HEIGHT);
        primaryStage.setScene(scene);

        primaryStage.show();

    }

    public World createWorld(){
        return new World();
    }

    public DebugPanel createDebugPanel(){
        return new DebugPanel();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
