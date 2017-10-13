package nl.janwillemhuising.model.tiles;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import nl.janwillemhuising.Settings;
import nl.janwillemhuising.model.PVector;

public class Tile {

    double height = Settings.PREFERED_TILE_HEIGTH;
    double width = Settings.PREFERED_TILE_WIDTH;

    PVector location;

    public Image[] frames;
    public double duration = Settings.TILE_ANIMATION_DURATION;


    int id;

    public Tile(int id, Image[] frames){
        this.id = id;
        this.frames = frames;
        location = new PVector(0,0);
    }

    public Tile(int id, Image[] frames ,PVector location){
        this.id = id;
        this.frames = frames;
        this.location = location;
    }
    public Tile(int id, Image[] frames ,PVector location, double h, double w){
        this.id = id;
        this.frames = frames;
        this.location = location;
        this.height = h;
        this.width = w;
    }

    public void setLocation(PVector location) {
        this.location = location;
    }
    public static Tile copy(Tile original){

        int id = original.getId();
        Image[] tileImage = original.getFrames();
        PVector location = original.getLocation();
        double h = original.getHeight();
        double w = original.getWidth();
        Tile clone = new Tile(id, tileImage, location, h, w);
        return clone;
    }
    public Image getTileImage(double time)
    {
        int index = (int)(time % 2);
        try{
            return frames[index];
        }catch (ArrayIndexOutOfBoundsException oobe){

        }
        return frames[0];
    }

    public Image[] getFrames() {
        return frames;
    }

    public int getId(){
        return id;
    }
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public PVector getLocation() {
        return location;
    }
}
