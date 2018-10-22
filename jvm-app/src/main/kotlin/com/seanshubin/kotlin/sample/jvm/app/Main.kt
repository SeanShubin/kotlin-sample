package com.seanshubin.kotlin.sample.jvm.app

import com.seanshubin.kotlin.sample.common.backend.CommonBackendGreeter
import com.seanshubin.kotlin.sample.common.generic.CommonGenericGreeter
import com.seanshubin.kotlin.sample.jvm.backend.JvmBackendGreeter

fun main(arguments: Array<String>) {
    val greeter = JvmAppGreeter(JvmBackendGreeter(CommonBackendGreeter(CommonGenericGreeter())))
    println(greeter.greet("world"))
}
