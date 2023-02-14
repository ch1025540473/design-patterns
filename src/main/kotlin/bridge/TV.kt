package src.main.kotlin.bridge

class TV : Device {
    override var channel: String = ""
        get() = "tv channel"
    override var volume: Int = 0
        set(value) {
            println("tv's volume is ".plus(value))
            field = value
        }
}