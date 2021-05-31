package br.com.moviecourotines

import designPatternsKotlin.behavioural.Printer
import designPatternsKotlin.creational.Singleton
import designPatternsKotlin.structural.*
import org.junit.Test

import org.junit.Assert.*
import java.util.*

class StrategyTest {
    @Test
    fun tesAdapter() {
        println("Start")
        val inputString = "LOREM ipsum DOLOR sit amet"

        val lowercaseFormatter = {it: String -> it.lowercase(Locale.getDefault()) }
        val uppercaseFormatter = {it: String -> it.uppercase(Locale.getDefault()) }

        val lowercasePrinter = Printer(lowercaseFormatter)
        lowercasePrinter.printString(inputString)

        val uppercasePrinter = Printer(uppercaseFormatter)
        uppercasePrinter.printString(inputString)
    }
}