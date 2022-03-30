package com.example.allinone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        one.setOnClickListener{
            val intent = Intent(this,animation::class.java)
            startActivity(intent)
        }
        two.setOnClickListener{
            val intent = Intent(this,videoplayer::class.java)
            startActivity(intent)
        }

        three.setOnClickListener{
            val intent = Intent(this,camera::class.java)
            startActivity(intent)
        }
        four.setOnClickListener{
            val intent = Intent(this,Sharedpreference::class.java)
            startActivity(intent)
        }
    }
}