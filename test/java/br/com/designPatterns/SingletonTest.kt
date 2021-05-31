package br.com.moviecourotines

import designPatternsKotlin.creational.Singleton
import org.junit.Test

import org.junit.Assert.*

class SingletonTest {
    @Test
    fun testSingleton() {
            println("Start")
            val networkDriver1: Singleton = Singleton.log()
            val networkDriver2: Singleton = Singleton.log()
            assertEquals(networkDriver1, networkDriver2)


    }
}