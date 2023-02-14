package src.main.kotlin.component

class Circle(x: Int, y: Int, radius: Int) : Dot(x, y) {

    var radius: Int = 0

    init {
        this.radius = radius
    }

    override fun draw() {
        println("Circle--".plus(x).plus("---").plus(y).plus("---").plus(radius))
    }
}