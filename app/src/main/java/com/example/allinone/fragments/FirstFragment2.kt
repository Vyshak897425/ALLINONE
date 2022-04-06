package com.example.allinone.fragments

import android.graphics.drawable.AnimatedVectorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.allinone.R

import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_first.view.*
import kotlinx.android.synthetic.main.fragment_first2.*
import kotlinx.android.synthetic.main.fragment_first2.view.*


class FirstFragment2 : Fragment() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val myview = inflater.inflate(R.layout.fragment_first2, container, false)
        var isChecked = true

        myview.avdImage.setOnClickListener{
            if (isChecked)
                checkToClose()
            else
                closeToCheck()

            isChecked = !isChecked
        }


        return myview
    }

    private fun closeToCheck() {
        avdImage.setImageResource(R.drawable.closetocheck)
        val avdCheckToClose = avdImage.drawable as AnimatedVectorDrawable
        avdCheckToClose.start()
    }

    fun checkToClose(){
        avdImage.setImageResource(R.drawable.checktoclose)
        val avdchecktoclose = avdImage.drawable as AnimatedVectorDrawable
        avdchecktoclose.start()
    }


}