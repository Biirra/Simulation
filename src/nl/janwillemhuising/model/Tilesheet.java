package nl.janwillemhuising.model;

import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import nl.janwillemhuising.Settings;

public class Tilesheet {

    private Image tilesheet;

    public Tilesheet(Image tilesheet){
        this.tilesheet = tilesheet;
    }

    public Node getTileImage(int cellX , int cellY){
        ImageView tileSheet = new ImageView(tilesheet);
        double tileWidth = Settings.PREFERED_TILE_WIDTH;
        double tileHeight = Settings.PREFERED_TILE_HEIGTH;
        Rectangle2D rect = new Rectangle2D(Settings.TILESHEET_X+(cellX*tileWidth), Settings.TILESHEET_Y+(cellY*tileHeight), tileWidth, tileHeight);
        tileSheet.setViewport(rect);
        //System.out.println(cellX+" - "+ cellY+"  X: "+rect.getMinX()+" Y: "+ rect.getMinY());

        return tileSheet;
    }

}
