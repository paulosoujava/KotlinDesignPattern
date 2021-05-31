package designPatternsKotlin.behavioural

import java.util.*

class Printer(private val stringFormatterStrategy: (String) -> String) {
    fun printString(message: String) {
        println(stringFormatterStrategy(message))
    }
}
