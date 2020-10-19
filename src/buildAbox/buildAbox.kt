package buildAbox
import java.lang.Math.*

open class buildAbox(open var length:Int = 10,open var width: Int = 10,open var height: Int = 10) {
    init{
        println("Generating a Box...")
    }

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
        println("Volume: $volume m^3 Surface Area: $SurfaceArea m^2")
    }
    constructor(volume: Int): this() {
        height = (volume/(length*width)).toInt()
    }
    open var volume: Int
        get() = width*length*height
        set(value) {
            height = (value)/(width*length)
        }
    open val shape = "Cuboid"

    open var SurfaceArea: Double = 0.0
         get() = (length*width+width*height+length*height)*2.0
}

class buildAcylinder (override var height: Int, var diameter: Int): buildAbox(
        height = height, width = diameter, length = diameter) {

    override var volume: Int = 0
        get() = (width / 2 * length / 2 * height * PI).toInt()

    override var SurfaceArea: Double = (2*PI*length/2*height)+2*(PI*length/2*width/2)
    override val shape = "Cylinder"
}