package com.ahmed.broadcastexample

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


/** Example Activity for broadcast reciever and activity lifecycle */
class MainActivity : AppCompatActivity() {
    private lateinit var receiver: MyReciever

    // 1...
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("lifecycle","1. oncreate")

        findViewById<Button>(R.id.btn_second_activity).setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }

        findViewById<Button>(R.id.btn_call_broadcast).setOnClickListener {
            callCustomBroadCast()
        }

        // On Android 8.0 or later, the receiver must be registered in code using the registerReceiver() method of the Activity class together with an appropriately configured IntentFilter object
        // Custom reciever
        sysBroadcast()
        // customBroadcast()
    }

    // 2..
    override fun onStart() {
        super.onStart()

        Log.e("lifecycle","2. onstart")
    }

    // 3.. // activity running
    override fun onResume() {
        super.onResume()

        Log.e("lifecycle","3. onresume")
    }

    // 4..
    override fun onPause() {
        super.onPause()

        Log.e("lifecycle","4. onpause")
    }

    // 5..
    override fun onStop() {
        super.onStop()

        Log.e("lifecycle","5. onstop")
    }

    // 6..
    override fun onRestart() {
        super.onRestart()

        Log.e("lifecycle","6. onrestart")
    }

    // 7..
    override fun onDestroy() {
        super.onDestroy()

         unregisterReceiver(receiver)
        Log.e("lifecycle","7. ondestroy")
    }

    private fun sysBroadcast() {
        val filter = IntentFilter()
        filter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED")
        filter.addAction("com.ahmed.broadcastexample")
        receiver = MyReciever()
        registerReceiver(receiver, filter)
    }

    fun callCustomBroadCast() {
        // val intent = Intent("com.journaldev.broadcastreceiver.SOME_ACTION")
        val intent = Intent("com.ahmed.broadcastexample")
        sendBroadcast(intent)
    }
}