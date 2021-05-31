package br.com.moviecourotines

import designPatternsKotlin.behavioural.AuthorizationPresenter
import designPatternsKotlin.creational.Singleton
import designPatternsKotlin.structural.*
import org.junit.Test

import org.junit.Assert.*

class StateTest {
    @Test
    fun tesAdapter() {
        println("Start")
        val authorizationPresenter = AuthorizationPresenter()

        authorizationPresenter.loginUser("admin")
        println(authorizationPresenter)
        assertTrue(authorizationPresenter.isAuthorized)
        assertTrue(authorizationPresenter.username.equals("admin"))

        authorizationPresenter.logoutUser()
        println(authorizationPresenter)
        assertFalse(authorizationPresenter.isAuthorized)
        assertTrue(authorizationPresenter.username.equals("Unknown"))
    }
}