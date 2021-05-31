package br.com.moviecourotines

import designPatternsKotlin.behavioural.ChatUser
import designPatternsKotlin.behavioural.Mediator
import designPatternsKotlin.creational.*
import org.hamcrest.core.Is
import org.junit.Assert
import org.junit.Test

class MediatorTest {
    @Test
    fun afTest(){
        val mediator = Mediator()
        val alice = ChatUser(mediator, "Alice")
        val bob = ChatUser(mediator, "Bob")
        val carol = ChatUser(mediator, "Carol")

        mediator.addUser(alice)
            .addUser(bob)
            .addUser(carol)

        carol.send("Hi everyone!")
    }
}