package nl.janwillemhuising.model.background.level;


import javafx.scene.image.Image;
import nl.janwillemhuising.model.PVector;
import nl.janwillemhuising.model.tiles.Tile;

public class Level {
    public Level() {


        setTileLevelOne(levelOne);
    }

    Tile[] allStaticTiles = {
            // static tiles
            new Tile(0, new Image[]{new Image("nl/janwillemhuising/img/grass/GrassM.png")}),
            new Tile(1, new Image[]{new Image("nl/janwillemhuising/img/grass/GrassCornerN.png")}),
            new Tile(2, new Image[]{new Image("nl/janwillemhuising/img/grass/GrassCornerW.png")}),
            new Tile(3, new Image[]{new Image("nl/janwillemhuising/img/grass/GrassCornerE.png")}),
            new Tile(4, new Image[]{new Image("nl/janwillemhuising/img/grass/GrassCornerS.png")}),
            new Tile(5, new Image[]{new Image("nl/janwillemhuising/img/grass/GrassCornerNW.png")}),
            new Tile(6, new Image[]{new Image("nl/janwillemhuising/img/grass/GrassCornerNE.png")}),
            new Tile(7, new Image[]{new Image("nl/janwillemhuising/img/grass/GrassCornerSW.png")}),
            new Tile(8, new Image[]{new Image("nl/janwillemhuising/img/grass/GrassCornerSE.png")}),
            new Tile(9, new Image[]{new Image("nl/janwillemhuising/img/grass_sand/GrassSandN.png")}),
            new Tile(10, new Image[]{new Image("nl/janwillemhuising/img/grass_sand/GrassSandW.png")}),
            new Tile(11, new Image[]{new Image("nl/janwillemhuising/img/grass_sand/GrassSandE.png")}),
            new Tile(12, new Image[]{new Image("nl/janwillemhuising/img/grass_sand/GrassSandS.png")}),
            new Tile(13, new Image[]{new Image("nl/janwillemhuising/img/grass_sand/GrassSandNW.png")}),
            new Tile(14, new Image[]{new Image("nl/janwillemhuising/img/grass_sand/GrassSandNE.png")}),
            new Tile(15, new Image[]{new Image("nl/janwillemhuising/img/grass_sand/GrassSandSW.png")}),
            new Tile(16, new Image[]{new Image("nl/janwillemhuising/img/grass_sand/GrassSandSE.png")}),

            // animated tiles
            new Tile(60, new Image[]{ //17
                    new Image("nl/janwillemhuising/img/animated_tiles/GrassSandWater/GrassSandWaterN.png"),
                    new Image("nl/janwillemhuising/img/animated_tiles/GrassSandWater/GrassSandWaterN1.png")
            }),
            new Tile(61, new Image[]{ //18
                    new Image("nl/janwillemhuising/img/animated_tiles/GrassSandWater/GrassSandWaterW.png"),
                    new Image("nl/janwillemhuising/img/animated_tiles/GrassSandWater/GrassSandWaterW1.png")
            }),
            new Tile(62, new Image[]{ //19
                    new Image("nl/janwillemhuising/img/animated_tiles/GrassSandWater/GrassSandWaterE.png"),
                    new Image("nl/janwillemhuising/img/animated_tiles/GrassSandWater/GrassSandWaterE1.png")
            }),
            new Tile(63, new Image[]{ //20
                    new Image("nl/janwillemhuising/img/animated_tiles/GrassSandWater/GrassSandWaterS.png"),
                    new Image("nl/janwillemhuising/img/animated_tiles/GrassSandWater/GrassSandWaterS1.png")
            }),
            new Tile(64, new Image[]{
                    new Image("nl/janwillemhuising/img/animated_tiles/GrassSandWater/GrassSandWaterNW.png"),
                    new Image("nl/janwillemhuising/img/animated_tiles/GrassSandWater/GrassSandWaterNW1.png")
            }),
            new Tile(65, new Image[]{
                    new Image("nl/janwillemhuising/img/animated_tiles/GrassSandWater/GrassSandWaterNE.png"),
                    new Image("nl/janwillemhuising/img/animated_tiles/GrassSandWater/GrassSandWaterNE1.png")
            }),
            new Tile(66, new Image[]{
                    new Image("nl/janwillemhuising/img/animated_tiles/GrassSandWater/GrassSandWaterSW.png"),
                    new Image("nl/janwillemhuising/img/animated_tiles/GrassSandWater/GrassSandWaterSW1.png")
            }),
            new Tile(67, new Image[]{
                    new Image("nl/janwillemhuising/img/animated_tiles/GrassSandWater/GrassSandWaterSE.png"),
                    new Image("nl/janwillemhuising/img/animated_tiles/GrassSandWater/GrassSandWaterSE1.png")
            }),
            new Tile(68, new Image[]{
                    new Image("nl/janwillemhuising/img/animated_tiles/Water/WaterShallow.png"),
                    new Image("nl/janwillemhuising/img/animated_tiles/Water/WaterShallow1.png")
            })
    };

    int[][] levelOne = {
            {12,12,12,12,12,16, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6},
            { 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3},
            { 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3},
            { 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3},
            { 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3},
            { 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3},
            { 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3},
            { 2, 0, 0, 0, 0, 0, 0, 0, 0, 0,21,17,17,17,17,22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3},
            { 2, 0, 0, 0, 0, 0, 0, 0, 0, 0,18,25,25,25,25,19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3},
            { 2, 0, 0, 0, 0, 0, 0, 0, 0, 0,18,25,25,25,25,19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3},
            { 2, 0, 0, 0, 0, 0, 0, 0, 0, 0,23,20,20,20,20,24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3},
            { 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3},
            { 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3},
            { 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3},
            { 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3},
            { 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3},
            { 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3},
            { 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3},
            { 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3},
            { 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3},
            { 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3},
            { 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3},
            { 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3},
            { 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3},
            { 7, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 8}
    };
    Tile[][] tileLevelOne = new Tile[25][45];

    public Tile[] getAllTiles() {
        return allStaticTiles ;
    }

    public Tile[][] getTileLevelOne() {
        return tileLevelOne;
    }

    // setting location of tiles
    private void setTileLevelOne(int[][] level) {
        for (int i = 0; i < level.length; i++) {
            for (int j = 0; j < level[i].length; j++) {
                int tmp = level[i][j];
                allStaticTiles[tmp].setLocation(new PVector(j * allStaticTiles[tmp].getWidth(), i * allStaticTiles[tmp].getHeight()));
                tileLevelOne[i][j] = Tile.copy(allStaticTiles[tmp]);
            }
        }
    }
}
