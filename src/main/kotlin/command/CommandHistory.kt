package src.main.kotlin.command

class CommandHistory {
    var commands: ArrayList<Command> = ArrayList()

    fun push(command: Command) {
        commands.add(command)
    }

    fun pop() : Command{
        return commands.removeFirst()
    }

}