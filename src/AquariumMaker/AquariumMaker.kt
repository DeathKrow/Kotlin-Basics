package AquariumMaker

fun makeAquarium() {
    val bowl = FishBowl()
    println(bowl.shape)
    bowl.clean()
    println(bowl.color)
    val tank = FishTank()
    println(tank.shape)
    tank.clean()
    println(tank.color)
}
fun main() {
    makeAquarium()
}
