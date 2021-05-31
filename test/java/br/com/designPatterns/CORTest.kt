package br.com.moviecourotines

import designPatternsKotlin.behavioural.AuthenticationHeader
import designPatternsKotlin.behavioural.BodyPayloadHeader
import designPatternsKotlin.behavioural.ContentTypeHeader
import org.junit.Assert
import org.junit.Test


class CORTest {
    @Test
    fun testChainOfResponsibility() {
        val authenticationHeader = AuthenticationHeader("123456")
        val contentTypeHeader = ContentTypeHeader("json")
        val bodyPayloadHeader = BodyPayloadHeader("Body: {\"username\" = \"john\"}")

        authenticationHeader.next = contentTypeHeader
        contentTypeHeader.next = bodyPayloadHeader

        val messageWithAuthentication = authenticationHeader.addHeader("Headers with authentication")
        println(messageWithAuthentication)

        println("-------------------------")

        val messageWithoutAuthentication = contentTypeHeader.addHeader("Headers without authentication")
        println(messageWithoutAuthentication)

        Assert.assertTrue(messageWithAuthentication.equals(
            """
                    Headers with authentication
                    Authorization: 123456
                    ContentType: json
                    Body: {"username" = "john"}
                """.trimIndent()
        ))

        Assert.assertTrue(messageWithoutAuthentication.equals(
            """
                    Headers without authentication
                    ContentType: json
                    Body: {"username" = "john"}
                """.trimIndent()
        ))
    }
}