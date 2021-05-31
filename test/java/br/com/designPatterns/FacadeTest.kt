package br.com.moviecourotines

import designPatternsKotlin.creational.LazyWithByLazy
import designPatternsKotlin.creational.LazyWithLateInit
import designPatternsKotlin.structural.User
import designPatternsKotlin.structural.UserRepository
import org.junit.Test

import org.junit.Assert.*

class FacadeTest {
    @Test
    fun testFacade() {
        println("Start")
        val userRep = UserRepository()
        val user = User("paul")
        userRep.save(user)
        val retrievedUser: User = userRep.findFirst()
        assertTrue(retrievedUser.login == "paul")
    }
}