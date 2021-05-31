package br.com.moviecourotines

import designPatternsKotlin.creational.Brazil
import designPatternsKotlin.creational.Currency
import designPatternsKotlin.creational.CurrencyFactory
import designPatternsKotlin.creational.Greece
import org.junit.Test

class FactoryMethodTest {
    @Test
    fun currencyTest(){
        val geekCurrency: String = CurrencyFactory.currencyForCountry(Greece("")).code
        println("Greek currency: $geekCurrency")

        val brCurrency: String = CurrencyFactory.currencyForCountry(Brazil("")).code
        println("Brazil currency: $brCurrency")
    }
}