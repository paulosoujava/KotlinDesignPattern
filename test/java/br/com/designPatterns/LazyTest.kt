package br.com.moviecourotines

import designPatternsKotlin.creational.LazyWithByLazy
import designPatternsKotlin.creational.LazyWithLateInit
import org.junit.Test

import org.junit.Assert.*

class LazyTest {
    @Test
    fun testLazy() {
            println("Start")
            val w = LazyWithByLazy()
            w.showMessage("Hello")
            assertNotNull(w.box)

        val w1 = LazyWithLateInit()
        w1.showMessage("Hello1")
        assertNotNull(w1.box)
    }
}