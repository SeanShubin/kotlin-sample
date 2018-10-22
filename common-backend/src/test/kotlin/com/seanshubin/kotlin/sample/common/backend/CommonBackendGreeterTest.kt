package com.seanshubin.kotlin.sample.common.backend

import com.seanshubin.kotlin.sample.common.generic.CommonGenericGreeter
import kotlin.test.Test
import kotlin.test.assertEquals

class CommonBackendGreeterTest {
    @Test
    fun greetTest() {
        val greeter = CommonBackendGreeter(CommonGenericGreeter())
        assertEquals("Hello, world!", greeter.greet("world"))
    }
}
