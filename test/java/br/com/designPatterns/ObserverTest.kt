package br.com.moviecourotines

import designPatternsKotlin.behavioural.Editor
import designPatternsKotlin.behavioural.EmailNotificationListener
import designPatternsKotlin.behavioural.LogOpenListener
import designPatternsKotlin.creational.Singleton
import designPatternsKotlin.structural.BasicRemote
import designPatternsKotlin.structural.Radio
import designPatternsKotlin.structural.TV
import org.junit.Test

import org.junit.Assert.*

class ObserverTest {
    @Test
    fun testObserver() {
        println("Start")
        val editor = Editor()
        val logListener = LogOpenListener("path/to/log/file.txt")
        val emailListener = EmailNotificationListener("test@test.com")
        editor.events.subscribe("open",logListener)
        editor.events.subscribe("save",emailListener)
        editor.events.subscribe("open",emailListener)

        editor.openFile("test.txt")
        editor.saveFile()
    }
}