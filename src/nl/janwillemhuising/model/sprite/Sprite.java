package nl.janwillemhuising.model.sprite;

import javafx.scene.Node;
import javafx.scene.layout.Region;
import nl.janwillemhuising.model.PVector;

/**
 * Created by JanWillem Huising on 6-7-2017.
 */
public abstract class Sprite extends Region{

    PVector location;
    PVector velocity;
    PVector acceleration;

    Node view;


    public Sprite(PVector location, PVector velocity, PVector acceleration, float m) {
        this.location = location;
        this.velocity = velocity;
        this.acceleration = acceleration;

        this.view = createView();

        getChildren().add(view);
    }
    public abstract Node createView();

    public Node getView(){
        return this.view;
    }

    public void update(){
        // set velocity depending on acceleration
        velocity.add(acceleration);

        // change location depending on velocity
        location.add(velocity);

        // clear acceleration;
        acceleration.mult(0);


        //relocate(location.getX(), location.getY());


        //setRotate(Math.toDegrees(angle));
    }

    public PVector getLocation() {
        return location;
    }
}
