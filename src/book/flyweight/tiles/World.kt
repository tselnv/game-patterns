package book.flyweight.tiles

import book.flyweight.tree.Texture
import java.util.*


class World {

    private val WIDTH = 400;
    private val HEIGHT = 300;
    private val tiles = Array2D<Terrain>(WIDTH,HEIGHT);

    private val grassTerrain = Terrain(1,false, Texture("grass texture"))
    private val hillTerrain = Terrain(3,false, Texture("hill texture"))
    private val riverTerrain = Terrain(2,true, Texture("water texture"))



    fun generateTerrain() {
        //Могу сказать, что это не самый лучший в мире алгоритм процедурной генерации местности.

        val rand = Random();

        for(x in 0 .. WIDTH){

            // Заполняем землю травой.
            for (y in 0 .. HEIGHT){
                // Добавляем немного холмиков.
                if(rand.nextInt(10) == 0){
                    tiles.set(x, y, hillTerrain);
                } else {
                    tiles.set(x, y, grassTerrain);
                }
            }
        }

        // Добавляем реку.
        val x = rand.nextInt(WIDTH);
        for(y in 0 .. HEIGHT){
            tiles.set(x, y, riverTerrain);
        }
    }


}
