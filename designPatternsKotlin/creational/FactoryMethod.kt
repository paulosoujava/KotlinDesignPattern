package designPatternsKotlin.creational

import java.util.*

//Sealed classes, ou classes seladas,
// são classes que representam uma hierarquia de classes muito restrita,
// por exemplo quando você tem um conjunto muito restrito de tipos.
sealed class Country{
    object Canada: Country()
}
object Spain:Country()
class Greece(val someProperty: String): Country()
class Brazil(val someProperty: String): Country()
class Currency(val code: String)
object CurrencyFactory {
    fun currencyForCountry(country: Country): Currency =
        when(country){
            is Spain -> Currency("EUR")
            is Greece ->Currency("EUR")
            is Brazil -> Currency("BR")
            is Country.Canada -> Currency("CAD")
        }
}

// other ex:
interface Animal{
    val id: Int
    val name: String
}
class Cat(override val id: Int): Animal{
    override val name = "cat"
}
class Dog(override val id: Int): Animal {
    override val name = "dog"
}
class AnimalFactory {
    var counter = 0
    fun createAnimal(animalType: String) : Animal {
        return when(animalType.trim().toLowerCase()) {
            "cat" -> Cat(++counter)
                "dog" -> Dog(++counter)
            else -> throw RuntimeException("Unknown animal $animalType")
        } }
}
fun main() {
    val factory = AnimalFactory()
    val animalTypes = listOf("dog", "dog", "cat", "dog", "cat", "cat")
    for (t in animalTypes) {
        val c = factory.createAnimal(t)
        println("${c.id} - ${c.name}")
    }
}

//pag 88