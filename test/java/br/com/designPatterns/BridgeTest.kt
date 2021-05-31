package br.com.moviecourotines

import designPatternsKotlin.creational.Singleton
import designPatternsKotlin.structural.BasicRemote
import designPatternsKotlin.structural.Radio
import designPatternsKotlin.structural.TV
import org.junit.Test

import org.junit.Assert.*

class BridgeTest {
    @Test
    fun testBridge() {
        println("Start")
        val tv = TV()
        val radio = Radio()
        val tvRemote = BasicRemote(tv)
        val radioRemote = BasicRemote(radio)

        tvRemote.volumeUp()
        tvRemote.volumeUp()
        tvRemote.volumeDown()
        assertTrue(tv.volume == 1)
        radioRemote.volumeUp()
        radioRemote.volumeUp()
        radioRemote.volumeDown()
        assertTrue(radio.volume == 1)
    }
}