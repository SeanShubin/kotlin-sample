package com.seanshubin.kotlin.sample.jvm.app

import com.seanshubin.kotlin.sample.jvm.backend.JvmBackendGreeter

class JvmAppGreeter(private val delegate:JvmBackendGreeter) {
    fun greet(target:String):String = delegate.greet(target)
}
