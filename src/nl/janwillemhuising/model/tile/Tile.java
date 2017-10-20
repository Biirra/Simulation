package nl.janwillemhuising.model.tile;

import javafx.scene.Node;
import javafx.scene.layout.Region;
import nl.janwillemhuising.Settings;
import nl.janwillemhuising.model.PVector;


public class Tile extends Region{
    private PVector location;
    private double
            w = Settings.PREFERED_TILE_WIDTH,
            h = Settings.PREFERED_TILE_HEIGTH; // in pixels

    private Node view;
    int colX, colY;

    public Tile(int colX, int colY){
        this.location = new PVector(0,0);

        this.colX = colX;
        this.colY = colY;
        this.view = createView(this.colX, this.colY);

        getChildren().add(view);
    }

    public Tile(int colX, int colY, PVector location){
        this.location = location;

        this.colX = colX;
        this.colY = colY;
        this.view = createView(this.colX, this.colY);

        this.view = createView(colX, colY);
        getChildren().add(view);
    }

    public void update(){
        relocate(location.getX(), location.getY());
    }


    public Node createView(int colX, int colY){
        return Settings.TILESHEETGRASSLAND.getTileImage(colX, colY);
    };

    public void setLocation(PVector location){
        this.location = location;
    }

    public PVector getLocation() {
        return location;
    }

    public int getColX() {
        return colX;
    }

    public int getColY() {
        return colY;
    }
    public static Tile copy(Tile original, PVector location){
       // System.out.println(original.getLocation());
        return new Tile(original.getColX(), original.getColY(), location);
    }
    public Node getTileImage() {
        return view;
    }

}
