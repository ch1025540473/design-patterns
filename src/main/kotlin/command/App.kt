package src.main.kotlin.command

class App {
    var clipBoard : String = ""
    private var commandHistory : CommandHistory = CommandHistory()

    fun executeCommand(command: Command){
        if (command.execute()){
            commandHistory.push(command)
        }
    }
}