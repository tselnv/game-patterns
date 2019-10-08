package book.flyweight.tiles

import java.util.ArrayList

class Array2D<T>(val xSize: Int, val ySize: Int) {
    private val array: ArrayList<T>

    init {
        array = ArrayList(ySize * xSize)
    }

    operator fun get(x: Int, y: Int): T {
        return array[y * xSize + x]
    }

    operator fun set(x: Int, y: Int, value: T) {
        array[y * xSize + x] = value
    }
}
