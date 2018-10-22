package com.seanshubin.kotlin.sample.jvm.backend

import com.seanshubin.kotlin.sample.common.backend.CommonBackendGreeter
import com.seanshubin.kotlin.sample.common.generic.CommonGenericGreeter
import kotlin.test.Test
import kotlin.test.assertEquals

class JvmBackendGreeterTest {
    @Test
    fun greetTest() {
        val greeter = JvmBackendGreeter(CommonBackendGreeter(CommonGenericGreeter()))
        assertEquals("Hello, world!", greeter.greet("world"))
    }
}
