package com.seanshubin.kotlin.sample.jvm.backend

import com.seanshubin.kotlin.sample.common.backend.CommonBackendGreeter

class JvmBackendGreeter(private val delegate:CommonBackendGreeter) {
    fun greet(target:String):String = delegate.greet(target)
}
