package com.ahmed.broadcastexample

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class MyReciever: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val message = "Broadcast intent detected " + intent?.action

        Toast.makeText(context, message,
            Toast.LENGTH_LONG).show()
        Log.e("lifecycle","broadcast reciever:"+message)
    }
}