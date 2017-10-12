package nl.janwillemhuising.model.tiles;

import javafx.scene.image.Image;
import nl.janwillemhuising.Settings;
import nl.janwillemhuising.model.PVector;

public class Tile {

    double height = Settings.PREFERED_TILE_HEIGTH;
    double width = Settings.PREFERED_TILE_WIDTH;

    PVector location;

    Image tileImage;

    int id;

    public Tile(int id, Image tileImage){
        this.id = id;
        this.tileImage = tileImage;
        location = new PVector(0,0);
    }

    public Tile(int id, Image tileImage ,PVector location){
        this.id = id;
        this.tileImage = tileImage;
        this.location = location;
    }
    public Tile(int id, Image tileImage ,PVector location, double h, double w){
        this.id = id;
        this.tileImage = tileImage;
        this.location = location;
        this.height = h;
        this.width = w;
    }

    public void setLocation(PVector location) {
        this.location = location;
    }
    public static Tile copy(Tile original){

        int id = original.getId();
        Image tileImage = original.getTileImage();
        PVector location = original.getLocation();
        double h = original.getHeight();
        double w = original.getWidth();

        Tile clone = new Tile(id, tileImage, location, h, w);
        return clone;
    }

    public Image getTileImage() {
        return tileImage;
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
