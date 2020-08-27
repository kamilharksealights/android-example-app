package io.sealights.android.io.sealights.android.example

import android.app.Application
import android.util.Log


class AndroidExampleApp: Application() {

    override fun onLowMemory() {
        super.onLowMemory()
        println("on low memory")
    }

}