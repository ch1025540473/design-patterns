package clone

class SubclassProtoType : ConcreteProtoType {

    var idCard = ""

    constructor(subclassProtoType: SubclassProtoType) : super(subclassProtoType) {
        this.idCard = subclassProtoType.idCard
    }

    constructor()

    override fun clone(): ProtoType {
        return SubclassProtoType(this)
    }

    override fun toString(): String {
        return "SubclassProtoType(idCard='$idCard')".plus(super.toString())
    }

}