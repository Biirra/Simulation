package nl.janwillemhuising.model;


import nl.janwillemhuising.Settings;
import nl.janwillemhuising.model.tile.Tile;

import java.util.HashMap;

public class Level {

    Tile[] allTiles = {
            // Tile:                       discription:                Array Index:
            new Tile(1, 1),     //grass                     0
            new Tile(3, 1),     //grass tall                1
            new Tile(2, 1),     //grass Sandyspot           2

            new Tile(0, 0),     //grass To Sand NW          3
            new Tile(1, 0),     //grass To Sand N1          4
            new Tile(2, 0),     //grass To Sand N2          5
            new Tile(3, 0),     //grass To Sand N3          6
            new Tile(4, 0),     //grass To Sand NE          7
            new Tile(0, 1),     //grass To Sand W1          8
            new Tile(0, 2),     //grass To Sand W2          9
            new Tile(0, 3),     //grass To Sand W3          10
            new Tile(4, 1),     //grass To Sand E1          11
            new Tile(4, 2),     //grass To Sand E2          12
            new Tile(4, 3),     //grass To Sand E3          13
            new Tile(0, 4),     //grass To Sand SW          14
            new Tile(1, 4),     //grass To Sand S1          15
            new Tile(2, 4),     //grass To Sand S2          16
            new Tile(3, 4),     //grass To Sand S3          17
            new Tile(4, 4),     //grass To Sand SE          18

            new Tile(2, 3),     //sand                      19
            new Tile(1, 3),     //sand Holes                20
            new Tile(3, 3),     //sand Grass patch          21

            new Tile(5, 0),     //sand To Grass NW          22
            new Tile(6, 0),     //sand To Grass NE          23
            new Tile(5, 1),     //sand To Grass SW          24
            new Tile(6 ,1),     //sand To Grass SE          25

            new Tile(5, 4),     //dark grass                26
            new Tile(8, 1),     //dark grass dirty          27
            new Tile(6, 4),     //dark grass tall           28

            new Tile(7, 0),     //grass To Darkgrass NW     29
            new Tile(8, 0),     //grass To Darkgrass N      30
            new Tile(9, 0),     //grass To Darkgrass NE     31
            new Tile(7, 1),     //grass To Darkgrass W      32
            new Tile(9, 1),     //grass To Darkgrass E      33
            new Tile(7, 2),     //grass To Darkgrass SW     34
            new Tile(8, 2),     //grass To Darkgrass S      35
            new Tile(9, 2),     //grass To Darkgrass SE     36

            new Tile(5, 2),     //darkgrass To grass NW     37
            new Tile(6, 2),     //darkgrass To grass NE     38
            new Tile(5, 3),     //darkgrass To grass SW     39
            new Tile(6, 2),     //darkgrass To grass NW     40

            new Tile(12, 8),    //water                     41
            new Tile(11, 8),    //water With Grassy Rock    42
            new Tile(12, 9),    //water With Lilypad        43
            new Tile(11, 9),    //water With Rock           44

            new Tile(10, 7),    //grass To Water NW         45
            new Tile(11, 7),    //grass To Water N1         46
            new Tile(12, 7),    //grass To Water N2         47
            new Tile(13, 7),    //grass To Water NE         48
            new Tile(10, 8),    //grass To Water W1         49
            new Tile(10, 9),    //grass To Water W2         50
            new Tile(13, 8),    //grass To Water E1         51
            new Tile(13, 9),    //grass To Water E2         52
            new Tile(10, 10),   //grass To Water SW         53
            new Tile(12, 10),   //grass To Water S2         54
            new Tile(11, 10),   //grass To Water S1         55
            new Tile(13, 10),   //grass To Water SE         56

            new Tile(14, 7),    //water to grassNW          57
            new Tile(15, 7),    //water to grassNE          58
            new Tile(14, 8),    //water to grassSW          59
            new Tile(15, 8),    //water to grassSE          60

            new Tile(14, 0),    //water to sandNW           61
            new Tile(15, 0),    //water to sandNE           62
            new Tile(14, 1),    //water to sandSW           63
            new Tile(15, 1)     //water to sandSE           64
    };

    Tile[][] level = new Tile[25][35];

    public Level() {

    }

    public void prepareTiles(int[][] level) {

        // Determine the color of each pixel in the image
        for (int readY = 0; readY < level.length; readY++) {
            for (int readX = 0; readX < level[readY].length; readX++) {
                // create location for the tile
                PVector location = new PVector(readX * Settings.PREFERED_TILE_WIDTH, readY * Settings.PREFERED_TILE_HEIGTH);

                this.level[readY][readX] = Tile.copy(allTiles[level[readY][readX]], location);
            }
        }
    }

    public Tile[][] getLevel() {
        return level;
    }
}
