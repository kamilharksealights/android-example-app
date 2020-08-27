package io.sealights.android.example

import android.app.IntentService
import android.content.Intent
import android.content.Context

// TODO: Rename actions, choose action names that describe tasks that this
// IntentService can perform, e.g. ACTION_FETCH_NEW_ITEMS
private const val ACTION_FOO = "io.sealights.android.example.action.FOO"
private const val ACTION_BAZ = "io.sealights.android.example.action.BAZ"

// TODO: Rename parameters
private const val EXTRA_PARAM1 = "io.sealights.android.example.extra.PARAM1"
private const val EXTRA_PARAM2 = "io.sealights.android.example.extra.PARAM2"

/**
 * An [IntentService] subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
class MyIntentService : IntentService("MyIntentService") {

    override fun onHandleIntent(intent: Intent?) {
        when (intent?.action) {
            ACTION_FOO -> {
                handleActionFoo()
            }
            ACTION_BAZ -> {
                handleActionBaz()
            }
        }
    }

    /**
     * Handle action Foo in the provided background thread with the provided
     * parameters.
     */
    private fun handleActionFoo() {
    }

    /**
     * Handle action Baz in the provided background thread with the provided
     * parameters.
     */
    private fun handleActionBaz() {

    }

    companion object {
        /**
         * Starts this service to perform action Foo with the given parameters. If
         * the service is already performing a task this action will be queued.
         *
         * @see IntentService
         */
        // TODO: Customize helper method
        @JvmStatic
        fun startActionFoo(context: Context, param1: String, param2: String) {
            val intent = Intent(context, MyIntentService::class.java).apply {
                action = ACTION_FOO
                putExtra(EXTRA_PARAM1, param1)
                putExtra(EXTRA_PARAM2, param2)
            }
            context.startService(intent)
        }

        /**
         * Starts this service to perform action Baz with the given parameters. If
         * the service is already performing a task this action will be queued.
         *
         * @see IntentService
         */
        // TODO: Customize helper method
        @JvmStatic
        fun startActionBaz(context: Context, param1: String, param2: String) {
            val intent = Intent(context, MyIntentService::class.java).apply {
                action = ACTION_BAZ
                putExtra(EXTRA_PARAM1, param1)
                putExtra(EXTRA_PARAM2, param2)
            }
            context.startService(intent)
        }
    }

    override fun onDestroy() {
        println("onDestroy service")
        super.onDestroy()
    }

    override fun onUnbind(intent: Intent?): Boolean {
        println("onUnbind service")
        return super.onUnbind(intent)
    }

    override fun onTaskRemoved(rootIntent: Intent?) {
        println("onTaskRemoved")
        super.onTaskRemoved(rootIntent)
    }
}
