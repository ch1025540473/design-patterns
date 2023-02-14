package src.main.kotlin.adapter

class SquarePegAdapter : RoundPeg {

    lateinit var squarePeg: SquarePeg

    constructor(squarePeg: SquarePeg) {
        this.squarePeg = squarePeg
    }

    override fun getRadius(): Int {
        return (squarePeg.width * Math.sqrt(2.0) / 2).toInt()
    }
}