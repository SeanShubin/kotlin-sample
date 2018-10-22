package com.seanshubin.kotlin.sample.common.backend

import com.seanshubin.kotlin.sample.common.generic.CommonGenericGreeter

class CommonBackendGreeter(private val delegate:CommonGenericGreeter) {
    fun greet(target:String):String = delegate.greet(target)
}
