package com.example.broadcast

import android.content.BroadcastReceiver
import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    val myReceiver: MyReceiver = MyReceiver()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*val filter = IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION).apply {
            addAction(Intent.ACTION_TIMEZONE_CHANGED)
        }
        registerReceiver(br, filter)*/
    }

    override fun onStart() {
        super.onStart()
        var intentFilter: IntentFilter = IntentFilter()
        intentFilter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        this.registerReceiver(myReceiver,intentFilter)
    }

    override fun onStop() {
        super.onStop()
        var intentFilter: IntentFilter = IntentFilter()
        intentFilter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        this.registerReceiver(myReceiver,intentFilter)
    }
}