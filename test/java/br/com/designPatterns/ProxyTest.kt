package br.com.moviecourotines

import designPatternsKotlin.creational.Singleton
import designPatternsKotlin.structural.BasicRemote
import designPatternsKotlin.structural.ProxyImage
import designPatternsKotlin.structural.Radio
import designPatternsKotlin.structural.TV
import org.junit.Test

import org.junit.Assert.*

class ProxyTest {
    @Test
    fun testProxy() {
        println("Start")
        val image = ProxyImage("test.png")
        println("1 time")
        image.display()
        println("2 time")
        image.display()
    }
}