package nl.janwillemhuising.model.tile;

import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Region;
import nl.janwillemhuising.Settings;
import nl.janwillemhuising.model.PVector;


public abstract class Tile extends Region{
    private PVector location;
    private double
            w = Settings.PREFERED_TILE_WIDTH,
            h = Settings.PREFERED_TILE_HEIGTH; // in pixels

    private Node view;
    int colX, colY;

    public Tile(Image tilesheet, int colX, int colY){
        this.location = new PVector(0,0);

        this.view = createView(tilesheet, colX, colY);
        getChildren().add(view);
    }

    public Tile(Image tilesheet, int colX, int colY , PVector location){
        this.location = location;

        this.view = createView(tilesheet, colX, colY);
        getChildren().add(view);
    }

    public void update(){
        relocate(location.getX(), location.getY());
    }


    public abstract Node createView(Image image, int colX, int colY);

    public void setLocation(PVector location){
        this.location = location;
    }

    public PVector getLocation() {
        return location;
    }

    public Node getTileImage() {
        return view;
    }
    public ImageView getTileImage(Image image, int cellX , int cellY){
        ImageView tileSheet = new ImageView(image);
        double tileWidth = Settings.PREFERED_TILE_WIDTH;
        double tileHeight = Settings.PREFERED_TILE_HEIGTH;
        Rectangle2D rect = new Rectangle2D(Settings.TILESHEET_X+(cellX*tileWidth), Settings.TILESHEET_Y+(cellY*tileHeight), tileWidth, tileHeight);
        tileSheet.setViewport(rect);
        System.out.println("X:  "+ cellX*tileWidth + "  Y:  " + cellY*tileHeight + "  colX:  " + cellX + "  cellY: " + cellY);
        return tileSheet;
    }
}
