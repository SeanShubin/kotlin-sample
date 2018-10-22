package com.seanshubin.kotlin.sample.js.app

import com.seanshubin.kotlin.sample.js.frontend.JsFrontendGreeter

class JsAppGreeter(private val delegate:JsFrontendGreeter) {
    fun greet(target:String):String = delegate.greet(target)
}
