package designPatternsKotlin.structural

interface Device {
    var volume: Int
    fun getName(): String
}

class Radio : Device {
    override var volume = 0
    override fun getName() = "RADIO $this"
}

class TV : Device {
    override var volume = 0
    override fun getName() = "TV $this"
}

interface Remote {
    fun volumeUp()
    fun volumeDown()
}

class BasicRemote(val device: Device) : Remote {
    override fun volumeDown() {
        device.volume--
        println("${device.getName()} volume down: ${device.volume}")
    }

    override fun volumeUp() {
        device.volume++
        println("${device.getName()} volume down: ${device.volume}")
    }
}

