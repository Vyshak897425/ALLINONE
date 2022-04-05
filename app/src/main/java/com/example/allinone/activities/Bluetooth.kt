package com.example.allinone.activities

import android.annotation.SuppressLint
import android.app.Activity
import android.bluetooth.BluetoothAdapter
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.allinone.R
import kotlinx.android.synthetic.main.activity_bluetooth.*

class Bluetooth : AppCompatActivity() {
    private var  REQUEST_CODE_ENABLE_BT : Int = 1;
    private var REQUEST_CODE_DISCOVERABLE_BT :Int = 2

    lateinit var bAdapter : BluetoothAdapter

    @SuppressLint("MissingPermission")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bluetooth)

        bAdapter = BluetoothAdapter.getDefaultAdapter()

        if(bAdapter==null){
            bluetoothStatusTv.text = "Bluetooth is not available"
        }else{
            bluetoothStatusTv.text = "Bluetooth is available"
        }

        if (bAdapter.isEnabled){
            bluetoothTv.setImageResource(R.drawable.ic_bluetooth_on)
        }else{
            bluetoothTv.setImageResource(R.drawable.ic_bluetooth_off)
        }

        turnOnBtn.setOnClickListener{
            if(bAdapter.isEnabled){
                Toast.makeText(this,"Already On",Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE)
                startActivityForResult(intent,REQUEST_CODE_ENABLE_BT)
                bluetoothTv.setImageResource(R.drawable.ic_bluetooth_on)
                Toast.makeText(this,"Bluetooth turned on",Toast.LENGTH_SHORT).show()


            }

        }
        turnOffBtn.setOnClickListener{
            if(!bAdapter.isEnabled){
                Toast.makeText(this,"Already off",Toast.LENGTH_SHORT).show()
            }else{
                bAdapter.disable()
                bluetoothTv.setImageResource(R.drawable.ic_bluetooth_off)
                Toast.makeText(this,"Bluetooth turned off",Toast.LENGTH_SHORT).show()
            }

        }
        showDevices.setOnClickListener{
            if (bAdapter.isDiscovering){
                Toast.makeText(this,"Making your device visible",Toast.LENGTH_SHORT).show()
                val intent = Intent(Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE))
                startActivityForResult(intent, REQUEST_CODE_DISCOVERABLE_BT)
            }

        }


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        when (requestCode){
            REQUEST_CODE_ENABLE_BT ->
                if(requestCode == Activity.RESULT_OK){
                    bluetoothTv.setImageResource(R.drawable.ic_bluetooth_on)
                    Toast.makeText(this,"Bluetooth is on",Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this,"could not connect",Toast.LENGTH_SHORT).show()
                }
        }
        super.onActivityResult(requestCode, resultCode, data)
    }
}