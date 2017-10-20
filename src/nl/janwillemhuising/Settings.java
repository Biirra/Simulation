package nl.janwillemhuising;

import javafx.scene.image.Image;
import nl.janwillemhuising.model.Tilesheet;

/**
 * Created by JanWillem Huising on 10-7-2017.
 */
public class Settings {


    public static double SCENE_WIDTH = 1280;
    public static double SCENE_HEIGHT = 768;


    public static int SPRITE_SLOW_DOWN_DISTANCE = 100; //pixels

    public static int ATTRACTOR_COUNT = 0;


    public static Tilesheet TILESHEETGRASSLAND = new Tilesheet(new Image("nl/janwillemhuising/img/Grassland@64x64.png"));
    //------------------------------------------
    //  Tile Size
    //------------------------------------------
    public static double PREFERED_TILE_WIDTH = 64;
    public static double PREFERED_TILE_HEIGTH = 64;

    //------------------------------------------
    //  Tile Size
    //------------------------------------------
    public static double TILESHEET_X = 0;
    public static double TILESHEET_Y = 0;

}
