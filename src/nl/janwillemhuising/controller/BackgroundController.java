package nl.janwillemhuising.controller;

import nl.janwillemhuising.model.background.level.Level;
import nl.janwillemhuising.view.BackgroundView;



public class BackgroundController {

    BackgroundView backgroundView;
    Level level = new Level();


    public BackgroundController(BackgroundView backgroundView){
        this.backgroundView = backgroundView;
    }

    public void update(){
        backgroundView.render(level.getTileLevelOne());
    }

}
