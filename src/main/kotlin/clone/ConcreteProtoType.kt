package clone

open class ConcreteProtoType : ProtoType {
    var id: Int = 0
    var name: String = ""

    constructor(protoType: ConcreteProtoType) {
        this.id = protoType.id
        this.name = protoType.name
    }

    constructor()

    override fun clone(): ProtoType {
        return ConcreteProtoType(this)
    }

//    override fun toString(): String {
//        return "ConcreteProtoType(id=$id, name='$name')"
//    }


}