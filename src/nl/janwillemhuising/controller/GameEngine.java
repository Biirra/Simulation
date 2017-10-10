package nl.janwillemhuising.controller;

import nl.janwillemhuising.model.World;
import nl.janwillemhuising.view.MainView;

public class GameEngine{

    World world;
    MainView view;

    public GameEngine(World model, MainView view){
        this.world = model;
        this.view = view;
        world.getAllExampleSprites().forEach(attractor -> {
            view.addSprite(attractor);  // Loading sprites
        });
    }

    public void update(){
        world.update();
        world.getAllExampleSprites().forEach(exampleSprite -> {
            exampleSprite.update();     // updating sprites
        });
    }
}
