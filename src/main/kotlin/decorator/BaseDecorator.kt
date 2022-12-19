package decorator

open class BaseDecorator(notifier: Notifier) : Notifier() {
    var notifier : Notifier? = null

    init {
        this.notifier = notifier
    }

    override fun send() {
        notifier?.send()
    }
}