package example.myapp

fun buildClass() {
    val myClass = ClassesBasics()
    myClass.printSize()
    myClass.height = 60
    myClass.printSize()

    val  myClass2 = ClassesBasics(width = 35, length = 100)
    myClass2.printSize()

}

fun main() {
    buildClass()
}