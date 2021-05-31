package br.com.moviecourotines

import designPatternsKotlin.behavioural.CareTaker
import designPatternsKotlin.behavioural.Originator
import designPatternsKotlin.creational.*
import org.hamcrest.core.Is
import org.junit.Assert
import org.junit.Test

class MementoTest {
    @Test
    fun testMemento(){
        val originator = Originator("initial state")
        val careTaker = CareTaker()
        careTaker.saveState(originator.createMemento())
        println("Current state is ${originator.state}")

        originator.state = "State 1"
        careTaker.saveState(originator.createMemento())
        println("Current state is ${originator.state}")

        originator.state = "State 2"
        careTaker.saveState(originator.createMemento())
        println("Current state is ${originator.state}")

        Assert.assertTrue(originator.state.equals("State 2"))

        originator.restoreMemento(careTaker.restore(1))
        println("Current state is ${originator.state}")
        Assert.assertTrue(originator.state.equals("State 1"))

        originator.restoreMemento(careTaker.restore(0))
        println("Current state is ${originator.state}")
        Assert.assertTrue(originator.state.equals("initial state"))

        originator.restoreMemento(careTaker.restore(2))
        println("Current state is ${originator.state}")
        Assert.assertTrue(originator.state.equals("State 2"))
    }
}