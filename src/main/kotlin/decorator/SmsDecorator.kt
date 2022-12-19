package decorator

class SmsDecorator(notifier: Notifier) :BaseDecorator(notifier) {

    override fun send() {
        super.send()
        println("sms send msg")
    }
}