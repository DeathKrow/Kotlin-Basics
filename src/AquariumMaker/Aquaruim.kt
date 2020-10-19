package AquariumMaker

abstract class Aquaruim {
    abstract val shape: String
}

class FishBowl: Aquaruim() {
    override val shape = "Sphere"
}

class FishTank: Aquaruim() {
    override val shape = "Cuboid"
}