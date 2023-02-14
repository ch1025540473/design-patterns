package src.main.kotlin.component

/**
 * 组合模式
 */
class CompoundGraphic : Graphic {

    var childern: ArrayList<Graphic> = ArrayList()

    override fun move(x: Int, y: Int) {

    }

    override fun draw() {
        childern.forEach {
            it.draw()
        }
    }

    fun add(graphic: Graphic) {
        childern.add(graphic)
    }
}