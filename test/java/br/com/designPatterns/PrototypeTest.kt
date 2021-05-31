package br.com.moviecourotines

import designPatternsKotlin.creational.Shape
import designPatternsKotlin.creational.ShapeCache
import org.junit.Test

import org.junit.Assert.*

class PrototypeTest {
    @Test
    fun testPrototype() {
            println("Start")
            ShapeCache.loadCache()
        val cloneShape1: Shape = ShapeCache.getShape("1")
        val cloneShape2: Shape = ShapeCache.getShape("2")
        val cloneShape3: Shape = ShapeCache.getShape("3")

        cloneShape1.draw()
        cloneShape2.draw()
        cloneShape3.draw()

        assertEquals(cloneShape1.type,"Circle")
        assertEquals(cloneShape2.type,"Square")
        assertEquals(cloneShape3.type,"Rectangle")

    }
}