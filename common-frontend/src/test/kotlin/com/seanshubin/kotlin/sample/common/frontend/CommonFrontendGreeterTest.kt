package com.seanshubin.kotlin.sample.common.frontend

import com.seanshubin.kotlin.sample.common.generic.CommonGenericGreeter
import kotlin.test.Test
import kotlin.test.assertEquals

class CommonFrontendGreeterTest {
    @Test
    fun greetTest() {
        val greeter = CommonFrontendGreeter(CommonGenericGreeter())
        assertEquals("Hello, world!", greeter.greet("world"))
    }
}
