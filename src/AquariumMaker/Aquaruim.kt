package AquariumMaker

abstract class Aquaruim {
    init{
        println("Creating Aquarium...")
    }
    abstract val shape: String
}

class FishBowl: Aquaruim(), AquariumCleaner {
    override val shape = "Sphere"
    override fun clean() {
        println("Cleaning fish bowl....")
    }
}

class FishTank: Aquaruim(), AquariumCleaner {
    override val shape = "Cuboid"
    override fun clean() {
        println("Cleaning fish tank....")
    }
}

interface AquariumCleaner {
    fun clean()
}
