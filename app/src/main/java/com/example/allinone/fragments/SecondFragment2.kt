package com.example.allinone.fragments

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import com.example.allinone.databinding.FragmentSecond2Binding

import kotlinx.android.synthetic.main.fragment_second.*
import kotlinx.android.synthetic.main.fragment_second.view.*


class SecondFragment2 : Fragment() {

    private var _binding : FragmentSecond2Binding? = null
    private val binding get() = _binding!!
    

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSecond2Binding.inflate(inflater,container,false)
        val mediaController = MediaController(context)
        mediaController.setAnchorView(binding.videoview)

        val onlineuri = Uri.parse("http://videocdn.bodybuilding.com/video/mp4/62000/62792m.mp4")

        binding.videoview.setMediaController(mediaController)
        binding.videoview.setVideoURI(onlineuri)
        binding.videoview.requestFocus()
        binding.videoview.start()


        return binding.root
    }


}