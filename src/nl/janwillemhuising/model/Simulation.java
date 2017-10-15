package nl.janwillemhuising.model;

import nl.janwillemhuising.Settings;
import nl.janwillemhuising.Utils;
import nl.janwillemhuising.model.sprite.ExampleSprite;

import java.util.ArrayList;

public class Simulation {

    ArrayList<ExampleSprite> allExampleSprites = new ArrayList<>();

    public Simulation(){
        //declare everything needed for simulation.
        prepareSprites();
    }

    // Main Simulation loop
    public void update(){
        // simulate
    }

    public void prepareSprites(){
        for (int i = 0; i < Settings.ATTRACTOR_COUNT; i++){
            addExampleSprite();
        }
    }

    public void addExampleSprite(){
        // random location
        float x = Utils.randomFloat(0,(float) Settings.SCENE_WIDTH);
        float y = Utils.randomFloat(0,(float)Settings.SCENE_HEIGHT);

        float mass = 3;

        // create Henry data
        PVector location = new PVector( x,y);
        PVector velocity = PVector.random2D();
        PVector acceleration = new PVector( 0,0);

        ExampleSprite exampleSprite = new ExampleSprite(location, velocity, acceleration, mass);

        allExampleSprites.add(exampleSprite);
    }

    public ArrayList<ExampleSprite> getAllExampleSprites(){
        return allExampleSprites;
    }
}
