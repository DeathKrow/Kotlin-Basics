package AquariumMaker

abstract class Aquaruim {
    init{
        println("Creating Aquarium...")
    }
    abstract val shape: String
}

class FishBowl: Aquaruim(), AquariumCleaner, AquariumColor {
    override val shape = "Sphere"
    override fun clean() {
        println("Cleaning fish bowl....")
    }
    override val color = "Cyan"
}

class FishTank: Aquaruim(), AquariumCleaner, AquariumColor by BlackColor {
    override val shape = "Cuboid"
    override fun clean() {
        println("Cleaning fish tank....")
    }
}

interface AquariumCleaner {
    fun clean()
}

interface AquariumColor {
    val color: String
}

object BlackColor : AquariumColor{
    override val color = "Black"
}
