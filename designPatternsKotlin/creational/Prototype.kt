package designPatternsKotlin.creational

abstract class Shape: Cloneable {
    var id: String? = null
    var type: String? = null

    abstract  fun draw()

    public override fun clone(): Any{
        var clone: Any? = null
        try{
            clone = super.clone()
        }catch(e: CloneNotSupportedException){
            e.printStackTrace()
        }
        return clone!!
    }
}
class Rectangle: Shape(){
    override fun draw() {
        println("Inside Rectangle::draw() method")
    }
    init {
        type = "Rectangle"
    }
}
class Square: Shape(){
    override fun draw() {
        println("Inside Square::draw() method")
    }
    init {
        type = "Square"
    }
}
class Circle: Shape(){
    override fun draw() {
        println("Inside Circle::draw() method")
    }
    init {
        type = "Circle"
    }
}
object ShapeCache {
    private val shapeMap = hashMapOf<String?, Shape>()
    fun loadCache(){
        val circle = Circle()
        val square = Square()
        val rectangle = Rectangle()
        shapeMap.put("1", circle)
        shapeMap.put("2", square)
        shapeMap.put("3", rectangle)
    }
    fun getShape(shapeId: String): Shape{
        val cachedShape: Shape? = shapeMap.get(shapeId)
        return cachedShape?.clone() as Shape
    }
}

//others
data class PC(val motherboard: String = "Terasus XZ27",
              val cpu: String = "Until Atom K500",
              val ram: String = "8GB Microcend BBR5",
              val graphicCard: String = "nKCF 8100TZ")

fun main() {
    val pcFromWarehouse = PC() // Our boring PC
    val pwnerPC = pcFromWarehouse.copy(graphicCard = "nKCF 8999ZTXX",
        ram = "16GB BBR6") // Amazing PC
    println(pwnerPC)
}