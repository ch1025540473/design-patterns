package src.main.kotlin.bridge

interface Remote {
    var device : Device

    fun volumeUp()
    fun volumeDown()
    fun channelUp()
    fun channelDown()

}