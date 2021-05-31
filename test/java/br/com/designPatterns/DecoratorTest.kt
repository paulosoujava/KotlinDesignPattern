package br.com.moviecourotines


import designPatternsKotlin.structural.EnhanceCoffeeMachine
import designPatternsKotlin.structural.NormalCoffeeMachine
import org.junit.Test

import org.junit.Assert.*

class DecoratorTest {
    @Test
    fun testDecorator() {
        println("Start")
        val normalCoffeeMachine = NormalCoffeeMachine()
        val enhancedMachine = EnhanceCoffeeMachine(normalCoffeeMachine)
        enhancedMachine.makeSmallCoffee()
        enhancedMachine.makeLargeCoffee()
        enhancedMachine.makeMilkCoffee()
    }
}