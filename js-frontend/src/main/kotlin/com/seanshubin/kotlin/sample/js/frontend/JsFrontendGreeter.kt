package com.seanshubin.kotlin.sample.js.frontend

import com.seanshubin.kotlin.sample.common.frontend.CommonFrontendGreeter

class JsFrontendGreeter(private val delegate:CommonFrontendGreeter) {
    fun greet(target:String):String = delegate.greet(target)
}
