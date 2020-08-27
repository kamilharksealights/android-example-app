package io.sealights.android.example

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder

class MyBindService : Service() {

    private val mBinder: IBinder = MyBinder()

    override fun onBind(intent: Intent): IBinder {
        return mBinder;
    }

    fun doIt() {
        println("doingIt")
    }

    public inner class MyBinder: Binder() {
        fun getService(): MyBindService {
            return this@MyBindService
        }
    }

    override fun onDestroy() {
        println("onDestroy bind")
        super.onDestroy()
    }

    override fun onUnbind(intent: Intent?): Boolean {
        println("onUnbind MyBindService")
        return super.onUnbind(intent)
    }
}
