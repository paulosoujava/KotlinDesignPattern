package designPatternsKotlin.creational

import java.util.concurrent.atomic.AtomicInteger

//SINGLETON DESIGN PATTERN :: CREATIONAL
object Singleton {
    init {
        println("Initializing $this")
    }
    fun log(): Singleton = apply { println("Network driver: $this")}
}

//other ex:
object CounterSingleton{
    private val counter = AtomicInteger(0)
    fun increment() = counter.incrementAndGet()
    init{
        println("I was accessed for the first time")
    }
}

fun main() {
    for(i in 1..19){
        println(CounterSingleton.increment())
    }
}