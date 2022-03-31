package com.example.allinone.fragments


import android.os.Bundle

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.allinone.R



class ThirdFragment : Fragment() {
    companion object{
        private const val CAMERA_PERMISSION_CODE = 1
        private const val CAMERA = 2
    }




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_third, container, false)
        return view
        }


    }


