package nl.janwillemhuising.view;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import nl.janwillemhuising.Settings;
import nl.janwillemhuising.model.tiles.Tile;

import java.io.File;

public class BackgroundView {



    double w = Settings.PREFERED_TILE_WIDTH;
    double h = Settings.PREFERED_TILE_HEIGTH;

    // gc for background canvas
    GraphicsContext gc;

    public BackgroundView(GraphicsContext gc) {
        this.gc = gc;

    }

    //----------------------------------
    // Render tiles depending on level
    //----------------------------------
    public void drawTile(Tile tile){
        gc.drawImage(tile.getTileImage(), tile.getLocation().getX() , tile.getLocation().getY());
    }
    public void render(Tile[][] level) {
        for (int i = 0; i < level.length; i++) {
            for (int j = 0; j < level[i].length; j++) {
                Tile tile = level[i][j];
                drawTile(tile);
            }
        }
    }
}
