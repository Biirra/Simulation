package nl.janwillemhuising.view;

import nl.janwillemhuising.Settings;
import nl.janwillemhuising.model.Layer;
import nl.janwillemhuising.model.sprite.Sprite;

public class MainView{

    Layer simulationLayer;

    public MainView(){
        simulationLayer = new Layer(Settings.SCENE_WIDTH, Settings.SCENE_HEIGHT);
    }

    public void addSprite(Sprite sprite){
        simulationLayer.getChildren().add(sprite); // spawn sprite
    }

    public Layer getSimulationLayer(){
        return simulationLayer;
    }

}
