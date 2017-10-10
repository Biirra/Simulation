package nl.janwillemhuising.controller;

import nl.janwillemhuising.model.Simulation;
import nl.janwillemhuising.view.MainView;

public class GameEngine{

    Simulation simulation;
    MainView view;

    public GameEngine(Simulation model, MainView view){
        this.simulation = model;
        this.view = view;

    }

    public void update(){
        simulation.update();
        view.rePaint();
        simulation.getAllExampleSprites().forEach(exampleSprite -> {
            System.out.println("drawing Sprite : " + exampleSprite);
            exampleSprite.update();
            view.drawSprite(exampleSprite);
        });
    }
}
