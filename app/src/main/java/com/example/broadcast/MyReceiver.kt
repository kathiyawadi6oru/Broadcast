package com.example.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        var action : String? = intent.action
        var timeZone: String? = intent.getStringExtra("time-zone")
        Toast.makeText(context,action+timeZone,Toast.LENGTH_LONG).show()

        Log.d("timezone", action.toString())
        var isOn : Boolean = intent.getBooleanExtra("state",false)
        Toast.makeText(context,isOn.toString(),Toast.LENGTH_SHORT).show()
    }
}