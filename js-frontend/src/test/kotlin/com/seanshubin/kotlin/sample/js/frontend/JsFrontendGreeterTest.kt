package com.seanshubin.kotlin.sample.js.frontend

import com.seanshubin.kotlin.sample.common.frontend.CommonFrontendGreeter
import com.seanshubin.kotlin.sample.common.generic.CommonGenericGreeter
import kotlin.test.Test
import kotlin.test.assertEquals

class JsFrontendGreeterTest {
    @Test
    fun greetTest() {
        val greeter = JsFrontendGreeter(CommonFrontendGreeter(CommonGenericGreeter()))
        assertEquals("Hello, world!", greeter.greet("world"))
    }
}
