package designPatternsKotlin.structural

open class Equipment(
    open val price: Int,
    val name: String
)
open class Composite(name: String): Equipment(0, name){
    private val  equipments = ArrayList<Equipment>()

    override val price: Int
        get() = equipments.map { it.price }.sum()
    fun add(equipment: Equipment)=apply { equipments.add(equipment) }
}

class Computer: Composite("PC")
class Processor: Equipment(1000, "Processor")
class HardDrive: Equipment(250, "Hard Drive")
class Memory: Composite( "Memory")
class Rom: Equipment(100, "Read only memory")
class Ram: Equipment(75, "Random access memory")