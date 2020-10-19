package AquariumMaker

fun makeAquarium() {
    val bowl = FishBowl()
    println(bowl.shape)
    bowl.clean()
    val tank = FishTank()
    println(tank.shape)
    tank.clean()
}
fun main() {
    makeAquarium()
}
