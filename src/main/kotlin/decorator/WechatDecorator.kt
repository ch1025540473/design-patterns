package decorator

class WechatDecorator(notifier: Notifier) : BaseDecorator(notifier) {

    override fun send() {
        super.send()
        println("wechat send msg")
    }
}