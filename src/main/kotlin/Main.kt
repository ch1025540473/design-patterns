import src.main.kotlin.bridge.RemoteControl
import src.main.kotlin.bridge.TV
import src.main.kotlin.command.App
import src.main.kotlin.command.CutCommand
import src.main.kotlin.command.Editor
import src.main.kotlin.component.Graphic
import src.main.kotlin.component.ImageEditor
import src.main.kotlin.component.TextView

fun main(args: Array<String>) {
//    var home = Home()
//
//    var zoo :  Zoo<Animal>? = null
//    zoo = Zoo<Dog>(Dog()) as Zoo<Animal>
//    println(zoo.getType())

    // 装饰者
//    var notifier = Notifier()
//
//    notifier = QQDecorator(notifier)
//    notifier = WechatDecorator(notifier)
//    notifier = SmsDecorator(notifier)
//
//    notifier.send()

    // 原型

//    var concreteProtoType = ConcreteProtoType()
//    concreteProtoType.id = 1
//    concreteProtoType.name = "ch"
//    var clone = ConcreteProtoType(concreteProtoType)
//    println(concreteProtoType)
//    println(clone)
//    println(clone.clone())

    // 工厂
//    var factory : GUIFactory
//    var platform : String = "MAC"
//
//    if (platform.equals("")){
//        factory = MacOSFactory()
//    }else{
//        factory = WindowsFactory()
//    }
//
//    var button = factory.createButton()
//    var image = factory.createImage()
//
//    button.click()
//    image.showImage("www.baidu.com")

    // 桥接
//    var device = TV()
//    var remote = RemoteControl(device)
//    remote.volumeUp()

    // 组合
//    var imageEditor = ImageEditor()
//    imageEditor.load()
//    var lists = ArrayList<Graphic>()
//    lists.add(TextView())
//    imageEditor.groupSelect(lists)
//
//    imageEditor.draw()


    // 命令
    var editor = Editor()
    var app = App()
    var command = CutCommand(app,editor)
    app.executeCommand(command)
    println(app.clipBoard)




}

class Home() {

    fun feeding(zoo: Zoo<in Taidi>) {
        zoo.t.toString()
        println(zoo.getType())
    }
}

class Zoo<T>(t: T) {
    var t: T? = null

    init {
        this.t = t
    }

    fun getType(): String? {
        return t!!::class.simpleName
    }

    fun setType(t: T) {
        this.t = t
    }
}

interface Do {
    fun jump()
}

open class Animal : Do {
    override fun jump() {

    }
}

open class Dog : Animal() {

}

class Taidi : Dog() {

}

