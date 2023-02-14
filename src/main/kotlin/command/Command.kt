package src.main.kotlin.command

abstract class Command(app: App, editor: Editor) {
    lateinit var app: App
    lateinit var editor: Editor

    init {
        this.app = app
        this.editor = editor
    }

    abstract fun execute(): Boolean

}

class CutCommand(app: App, editor: Editor) : Command(app, editor) {

    override fun execute(): Boolean {
        app.clipBoard = editor.getSelection()
        println("CutCommand execute")
        return true
    }

}