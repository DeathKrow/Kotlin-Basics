package buildAbox

fun main() {
    buildBox()
}

fun buildBox() {
    val Box = buildAbox()
    Box.printSize()

    val Box2 = buildAbox()
    Box2.printSize()
    Box2.volume = 2000
    Box2.printSize()

    val Cylinder = buildAcylinder(diameter = 25,height= 40)
    Cylinder.printSize()
}
