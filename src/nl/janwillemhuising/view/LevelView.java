package nl.janwillemhuising.view;

import nl.janwillemhuising.Settings;
import nl.janwillemhuising.model.Layer;
import nl.janwillemhuising.model.tile.Tile;

public class LevelView {
    Layer backgroundLayer;


    public LevelView() {
        backgroundLayer = new Layer(Settings.SCENE_WIDTH, Settings.SCENE_HEIGHT);
    }

    public void addTile(Tile tile) {
        backgroundLayer.getChildren().add(tile);
    }

    public Layer getLevelLayer() {
        return backgroundLayer;
    }
}
