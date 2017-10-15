package nl.janwillemhuising.model;


import javafx.scene.image.Image;
import javafx.scene.image.PixelReader;
import nl.janwillemhuising.Settings;
import nl.janwillemhuising.model.tile.Tile;
import nl.janwillemhuising.model.tile.grass_tiles.Grass;

public class Level {

    Image tileSheetRaw = new Image("nl/janwillemhuising/img/tilesheet.png");
    PixelReader reader;
    Grass grassN;
    Grass grassM;

    Tile[][] level = new Tile[25][45];

    public Level(){

    }

    public void prepareTiles(int[][] level){
        for(int i = 0; i < level.length; i++){
            for(int j = 0; j < level[i].length; j ++){
                PVector location = new PVector(j* Settings.PREFERED_TILE_WIDTH, i*Settings.PREFERED_TILE_HEIGTH);
                //System.out.println(location);
                int tmp = level[i][j];
                switch (tmp){
                    case 0:
                        this.level[i][j] = new Grass(tileSheetRaw, 1, 1 , location);    // grass middel
                        break;
                    case 1:
                        this.level[i][j] = new Grass(tileSheetRaw,1, 0 , location);     // grass N
                        break;
                    case 2:
                        this.level[i][j] = new Grass(tileSheetRaw,0, 1 , location);     // grass W
                        break;
                    case 3:
                        this.level[i][j] = new Grass(tileSheetRaw,2, 1 , location);     // grass E
                        break;
                    case 4:
                        this.level[i][j] = new Grass(tileSheetRaw,1, 2 , location);     // grass S
                        break;
                    case 5:
                        this.level[i][j] = new Grass(tileSheetRaw,0, 0 , location);     // grass NW
                        break;
                    case 6:
                        this.level[i][j] = new Grass(tileSheetRaw,2, 0 , location);     // grass NE
                        break;
                    case 7:
                        this.level[i][j] = new Grass(tileSheetRaw,0, 2 , location);     // grass SW
                        break;
                    case 8:
                        this.level[i][j] = new Grass(tileSheetRaw,2, 2 , location);     // grass SE
                        break;
                    case 9:
                        this.level[i][j] = new Grass(tileSheetRaw,1, 12 , location);     // tree bottom bottom-right
                        break;
                    case 10:
                        this.level[i][j] = new Grass(tileSheetRaw,0, 12 , location);     // tree bottom bottom-left
                        break;
                    case 11:
                        this.level[i][j] = new Grass(tileSheetRaw,1, 11 , location);     // tree bottom top-right
                        break;
                    case 12:
                        this.level[i][j] = new Grass(tileSheetRaw,0, 11 , location);     // tree bottom top-left
                        break;
                }
            }
        }
    }

    public Tile[][] getLevel() {
        return level;
    }
}
