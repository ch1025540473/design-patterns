package src.main.kotlin.component

open class Dot(x : Int, y : Int) : Graphic{
    var x : Int = 0
    var y : Int = 0

    init {
        this.x = x
        this.y = y
    }

    override fun move(x: Int, y: Int) {

    }

    override fun draw() {
        println("Dot--".plus(x).plus("---").plus(y))
    }

}