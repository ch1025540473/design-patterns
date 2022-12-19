package decorator

class QQDecorator(notifier: Notifier) : BaseDecorator(notifier) {

    override fun send() {
        super.send()
        println("qq send msg")
    }
}