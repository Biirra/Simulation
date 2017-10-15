package nl.janwillemhuising.model.tile.grass_tiles;

import javafx.scene.Node;
import javafx.scene.image.Image;
import nl.janwillemhuising.model.PVector;
import nl.janwillemhuising.model.tile.Tile;

public class Grass extends Tile{

    public Grass(Image tilesheet, int colX, int colY){
        super(tilesheet, colX, colY);
    }
    public Grass(Image tilesheet, int colX, int colY, PVector location){
        super(tilesheet, colX, colY, location);
    }
    @Override
    public Node createView(Image stylesheet, int colX, int colY) {
        return getTileImage(stylesheet, colX, colY);
    }
}
