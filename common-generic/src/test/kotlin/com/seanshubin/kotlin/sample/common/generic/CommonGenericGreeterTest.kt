package com.seanshubin.kotlin.sample.common.generic

import kotlin.test.Test
import kotlin.test.assertEquals

class CommonGenericGreeterTest {
    @Test
    fun greetTest() {
        val greeter = CommonGenericGreeter()
        assertEquals("Hello, world!", greeter.greet("world"))
    }
}
