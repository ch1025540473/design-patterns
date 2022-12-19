package decorator

open class Notifier {
    open fun send() {
        println("email send msg")
    }
}