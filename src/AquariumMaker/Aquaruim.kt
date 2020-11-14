package AquariumMaker

//Abstract Class
abstract class Aquaruim {
    init{
        println("Creating Aquarium...")
    }
    abstract val shape: String
}

//Inheritance
class FishBowl: Aquaruim(), AquariumCleaner, AquariumColor {
    override val shape = "Sphere"
    override fun clean() {
        println("Cleaning fish bowl....")
    }
    override val color = "Cyan"
}

//Interface Delegation
class FishTank(color: AquariumColor = BlackColor): Aquaruim(),
        AquariumCleaner by Cleaner("Cleaning fish tank..."), AquariumColor by color{
    override val shape = "Cuboid"
    }

interface AquariumCleaner {
    fun clean()
}

interface AquariumColor {
    val color: String
}

//Singleton Class
object BlackColor : AquariumColor{
    override val color = "Black"
}

class Cleaner(val clean: String) : AquariumCleaner {
    override fun clean() {
        println(clean)
    }
}
