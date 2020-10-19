package AquariumMaker

fun makeAquarium() {
    val bowl = FishBowl()
    val tank = FishTank()

    println(bowl.shape)
    println(tank.shape)
}

fun main() {
    makeAquarium()
}