package example.myapp

class ClassesBasics (var width: Int = 20, var height: Int = 40,var length: Int = 100) {
    init {
        println("Class Intializing..")
    }
    init {
        println("Volume: ${width*length*height/1000} L")
    }
    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
    }

}


