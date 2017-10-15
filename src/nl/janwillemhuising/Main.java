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
import nl.janwillemhuising.controller.LevelController;
import nl.janwillemhuising.model.DebugPanel;
import nl.janwillemhuising.model.Level;
import nl.janwillemhuising.model.Simulation;
import nl.janwillemhuising.view.DebugView;
import nl.janwillemhuising.view.LevelView;
import nl.janwillemhuising.view.MainView;


public class Main extends Application {

    AnimationTimer simulationLoop;
    Scene scene;

    @Override
    public void start(Stage primaryStage) throws Exception {
        // create window
        primaryStage.setTitle("NatureOfCode");
        //primaryStage.getIcons().add(new Image("https://www.shareicon.net/data/64x64/2016/08/22/818801_plant_512x512.png"));
        BorderPane root = new BorderPane();

        Pane layerPane = new Pane();
        root.setCenter(layerPane);

        // create a debug panel for usefull information
        DebugPanel debugPanel = createDebugPanel();
        DebugView debugView = new DebugView();

        // create a background
        Level level = new Level();
        LevelView levelView = new LevelView();

        // create the simulation
        Simulation simulation = createSimulation();
        MainView mainView = new MainView();

        Debugcontroller debugcontroller = new Debugcontroller(debugPanel, debugView);
        LevelController levelController = new LevelController(level, levelView);
        GameEngine gameEngine = new GameEngine(simulation, mainView);

        //-----------------------------
        // Application Loop
        //-----------------------------
        simulationLoop = new AnimationTimer(){
            @Override
            public void handle(long now) {
                debugcontroller.update(now);
                levelController.update();
                gameEngine.update();
            }
        };
        simulationLoop.start();

        layerPane.getChildren().add(levelView.getLevelLayer());
        layerPane.getChildren().add(mainView.getSimulationLayer());
        layerPane.getChildren().add(debugView.getDebugView());


        scene = new Scene(root, Settings.SCENE_WIDTH, Settings.SCENE_HEIGHT);
        primaryStage.setScene(scene);

        primaryStage.show();

    }

    public Simulation createSimulation(){
        return new Simulation();
    }

    public DebugPanel createDebugPanel(){
        return new DebugPanel();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
