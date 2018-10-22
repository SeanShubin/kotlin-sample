package com.seanshubin.kotlin.sample.js.app

import com.seanshubin.kotlin.sample.common.frontend.CommonFrontendGreeter
import com.seanshubin.kotlin.sample.common.generic.CommonGenericGreeter
import com.seanshubin.kotlin.sample.js.frontend.JsFrontendGreeter

fun main(arguments: Array<String>) {
    val greeter = JsAppGreeter(JsFrontendGreeter(CommonFrontendGreeter(CommonGenericGreeter())))
    println(greeter.greet("world"))
}
