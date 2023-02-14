package src.main.kotlin.adapter

interface RoundHole {
    fun getRadius(): Int
    fun fits(peg: RoundPeg): Boolean {
        return this.getRadius() >= peg.getRadius()
    }
}