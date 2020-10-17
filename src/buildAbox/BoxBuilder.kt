package buildAbox

fun main() {
    buildBox()
}

fun buildBox() {
    val Box = buildAbox()
    Box.printSize()

    val Box2 = buildAbox()
    Box2.printSize()
    Box2.volume = 1500
    Box2.printSize()
}