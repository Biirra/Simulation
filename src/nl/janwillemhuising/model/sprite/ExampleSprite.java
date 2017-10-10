package nl.janwillemhuising.model.sprite;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import nl.janwillemhuising.model.Layer;
import nl.janwillemhuising.model.PVector;

/**
 * Created by JanWillem Huising on 8-7-2017.
 */
public class ExampleSprite extends Sprite {

    public ExampleSprite(PVector location, PVector velocity, PVector acceleration, float m){
        super(location,velocity,acceleration,m);
    }
    @Override
    public Node createView() {

        double radius = 2;

        Circle circle = new Circle( radius);

        circle.setCenterX(radius);
        circle.setCenterY(radius);

        circle.setStroke(Color.GREEN);
        circle.setFill(Color.GREEN.deriveColor(1, 1, 1, 0.3));

        return circle;
    }
}
