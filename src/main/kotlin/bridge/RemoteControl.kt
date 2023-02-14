package src.main.kotlin.bridge

class RemoteControl(override var device: Device) : Remote {

    override fun volumeUp() {
        device.volume = device.volume + 10
    }

    override fun volumeDown() {
        device.volume = device.volume - 10
    }

    override fun channelUp() {
    }

    override fun channelDown() {
    }
}