package nl.janwillemhuising.view;

import javafx.scene.canvas.GraphicsContext;
import nl.janwillemhuising.Settings;
import nl.janwillemhuising.model.tiles.Tile;

public class BackgroundView {



    double w = Settings.PREFERED_TILE_WIDTH;
    double h = Settings.PREFERED_TILE_HEIGTH;

    // gc for background canvas
    GraphicsContext gc;

    public BackgroundView(GraphicsContext gc) {
        this.gc = gc;

    }
    public void teeest() {
//        AnimatedImage ufo = new AnimatedImage();
//        Image[] imageArray = new Image[6];
//        for (int i = 0; i < 6; i++)
//            imageArray[i] = new Image("ufo_" + i + ".png");
//        ufo.frames = imageArray;
//        ufo.duration = 0.100;
    }

    //----------------------------------
    // Render tiles depending on level
    //----------------------------------
    public void drawTile(Tile tile, double time){
        gc.drawImage(tile.getTileImage(time), tile.getLocation().getX() , tile.getLocation().getY());
    }
    public void render(Tile[][] level, double time) {
        for (int i = 0; i < level.length; i++) {
            for (int j = 0; j < level[i].length; j++) {
                Tile tile = level[i][j];
                drawTile(tile, time);
            }
        }
    }
}
