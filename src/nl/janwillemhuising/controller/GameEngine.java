package nl.janwillemhuising.controller;

import nl.janwillemhuising.model.Simulation;
import nl.janwillemhuising.view.MainView;

public class GameEngine{

    Simulation simulation;
    MainView view;

    public GameEngine(Simulation model, MainView view){
        this.simulation = model;
        this.view = view;
        simulation.getAllExampleSprites().forEach(attractor -> {
            view.addSprite(attractor);  // Loading sprites
        });
    }

    public void update(){
        simulation.update();
        simulation.getAllExampleSprites().forEach(exampleSprite -> {
            exampleSprite.update();     // updating sprites
        });
    }
}
