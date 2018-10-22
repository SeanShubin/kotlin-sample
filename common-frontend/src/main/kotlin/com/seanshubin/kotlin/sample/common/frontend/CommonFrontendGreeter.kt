package com.seanshubin.kotlin.sample.common.frontend

import com.seanshubin.kotlin.sample.common.generic.CommonGenericGreeter

class CommonFrontendGreeter(private val delegate:CommonGenericGreeter) {
    fun greet(target:String):String = delegate.greet(target)
}
