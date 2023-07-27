package com.ahmed.broadcastexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    // 1...
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        Log.e("lifecycle activity2","2. oncreate")
    }


    // 2..
    override fun onStart() {
        super.onStart()

        Log.e("lifecycle activity2","2. onstart")
    }

    // 3.. // activity running
    override fun onResume() {
        super.onResume()

        Log.e("lifecycle activity2","3. onresume")
    }

    // 4..
    override fun onPause() {
        super.onPause()

        Log.e("lifecycle activity2","4. onpause")
    }

    // 5..
    override fun onStop() {
        super.onStop()

        Log.e("lifecycle activity2","5. onstop")
    }

    // 6..
    override fun onRestart() {
        super.onRestart()

        Log.e("lifecycle activity2","6. onrestart")
    }

    // 7..
    override fun onDestroy() {
        super.onDestroy()

        Log.e("lifecycle activity2","7. ondestroy")
    }
}