package com.example.allinone.activities

import android.content.Context
import android.content.Intent
import android.net.wifi.WifiManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import com.example.allinone.R
import kotlinx.android.synthetic.main.activity_wifimanager.*

class Wifimanager : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wifimanager)

        buttonOn.setOnClickListener {
            switchWIFI(true)
        }

        buttonOFF.setOnClickListener {
            switchWIFI(false)
        }
    }
    fun switchWIFI(isON: Boolean) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            val panelIntent = Intent(Settings.Panel.ACTION_WIFI)
            startActivityForResult(panelIntent, 1)
        } else {

            val wmgr = applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager
            wmgr.setWifiEnabled(isON)
        }
    }


}