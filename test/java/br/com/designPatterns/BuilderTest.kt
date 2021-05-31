package br.com.moviecourotines


import designPatternsKotlin.creational.Component
import org.junit.Test

import org.junit.Assert.*

class BuilderTest {
    @Test
    fun testBuilder() {
          val component= Component.Builder()
            .setParam1("Hello")
            .setParam2(2)
            .setParam3(false)
        assertEquals(component.getParam1(), "Hello")
        assertEquals(component.getParam2(), 2)
        assertEquals(component.getParam3(), false)

    }
}