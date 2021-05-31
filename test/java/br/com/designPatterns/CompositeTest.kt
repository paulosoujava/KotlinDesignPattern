package br.com.moviecourotines


import designPatternsKotlin.structural.*
import org.junit.Test

import org.junit.Assert.*

class CompositeTest {
    @Test
    fun testComposite() {
        println("Start")
        val memory: Composite = Memory()
            .add(Rom())
            .add(Ram())
        val pc: Composite = Computer()
            .add(memory)
            .add(Processor())
            .add(HardDrive())

        assertTrue(pc.name == "PC")
        assertTrue(pc.price == 1425)
    }
}