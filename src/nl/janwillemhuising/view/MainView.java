package nl.janwillemhuising.view;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import nl.janwillemhuising.Settings;
import nl.janwillemhuising.model.sprite.Sprite;

public class MainView{

    GraphicsContext gc;

    public MainView(GraphicsContext gc){
        this.gc = gc;
        gc.setFill(Color.LIGHTGRAY);
        gc.fillRect(0,0, Settings.SCENE_WIDTH,Settings.SCENE_HEIGHT);
    }

    public void drawSprite(Sprite sprite){
        gc.setFill(Color.RED);
        gc.fillRect((double)sprite.getLocation().getX(), (double) sprite.getLocation().getY(),4,4);
    }
    public void rePaint(){
        gc.setFill(Color.LIGHTGRAY);
        gc.fillRect(0,0, Settings.SCENE_WIDTH,Settings.SCENE_HEIGHT);
    }

    public GraphicsContext getGc() {
        return gc;
    }
}
