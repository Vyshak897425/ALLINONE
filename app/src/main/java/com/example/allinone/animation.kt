package com.example.allinone

import android.graphics.drawable.AnimatedVectorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_animation.*

class animation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)

        var isChecked = true

        avdImage.setOnClickListener{
            if (isChecked)
                checkToClose()
            else
                closeToCheck()

            isChecked = !isChecked
        }
    }

    private fun closeToCheck() {
        avdImage.setImageResource(R.drawable.closetocheck)
        val avdCheckToClose = avdImage.drawable as AnimatedVectorDrawable
        avdCheckToClose.start()
    }

    private fun checkToClose(){
        avdImage.setImageResource(R.drawable.checktoclose)
        val avdchecktoclose = avdImage.drawable as AnimatedVectorDrawable
        avdchecktoclose.start()
    }
}