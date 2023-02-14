package src.main.kotlin.component

class ImageEditor {
    lateinit var all : CompoundGraphic

    fun load(){
        all = CompoundGraphic()
        all.add(Dot(1,2))
        all.add(Circle(2,3,10))
    }

    fun groupSelect(components : ArrayList<Graphic>){
        var group = CompoundGraphic()
        for (component in components){
            group.add(component)
        }

        all.add(group)
    }

    fun draw(){
        all.draw()
    }

}