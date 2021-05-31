package br.com.moviecourotines

import designPatternsKotlin.behavioural.CommandProcessor
import designPatternsKotlin.behavioural.OrderAddCommand
import designPatternsKotlin.behavioural.OrderPayCommand
import designPatternsKotlin.creational.Singleton
import designPatternsKotlin.structural.*
import org.junit.Test

import org.junit.Assert.*

class CommandTest {
    @Test
    fun tesAdapter() {
        println("Start")
        CommandProcessor()
            .addToQueue(OrderAddCommand(1L))
            .addToQueue(OrderAddCommand(2L))
            .addToQueue(OrderPayCommand(2L))
            .addToQueue(OrderPayCommand(1L))
            .processCommands()
    }
}