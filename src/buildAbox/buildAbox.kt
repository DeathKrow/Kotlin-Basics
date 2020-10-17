package buildAbox

class buildAbox(open var length:Int = 10,open var width: Int = 10,open var height: Int = 10) {
    init{
        println("Generating a Box...")
    }

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
        println("Volume: $volume m^3 Surface Area: $SurfaceArea")
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