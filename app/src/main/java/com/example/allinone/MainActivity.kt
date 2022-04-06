package com.example.allinone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.example.allinone.activities.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ttb = AnimationUtils.loadAnimation(this,R.anim.toptobottom)
        val stb = AnimationUtils.loadAnimation(this,R.anim.imageanim)
        one.startAnimation(ttb)
        two.startAnimation(ttb)
        three.startAnimation(ttb)
        four.startAnimation(ttb)
        five.startAnimation(ttb)
        six.startAnimation(ttb)
        seven.startAnimation(ttb)
        eight.startAnimation(ttb)
        nine.startAnimation(ttb)
        ten.startAnimation(ttb)
        eleven.startAnimation(ttb)
        twelve.startAnimation(ttb)
        imageview.startAnimation(stb)


        one.setOnClickListener{
            val intent = Intent(this, animation::class.java)
            startActivity(intent)
        }
        two.setOnClickListener{
            val intent = Intent(this, videoplayer::class.java)
            startActivity(intent)
        }

        three.setOnClickListener{
            val intent = Intent(this, camera::class.java)
            startActivity(intent)
        }
        four.setOnClickListener{
            val intent = Intent(this, Sharedpreference::class.java)
            startActivity(intent)
        }
        five.setOnClickListener{
            val intent = Intent(this, Fragmentss::class.java)
            startActivity(intent)
        }
        imageview.setOnClickListener{
            imageview.animate().apply {
                duration = 1000
                rotationXBy(360f)
            }.start()
        }

        six.setOnClickListener{
            val intent = Intent(this, gyroscope::class.java)
            startActivity(intent)
        }
        seven.setOnClickListener{
            val intent = Intent(this, Bluetooth::class.java)
            startActivity(intent)
        }
        eight.setOnClickListener{
            val intent = Intent(this, Wifimanager::class.java)
            startActivity(intent)
        }
        nine.setOnClickListener{
            val intent = Intent(this, Webview::class.java)
            startActivity(intent)
        }
        ten.setOnClickListener{
            val intent = Intent(this, ProjectONE::class.java)
            startActivity(intent)
        }


    }
}