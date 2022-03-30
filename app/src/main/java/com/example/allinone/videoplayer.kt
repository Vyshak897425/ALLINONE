package com.example.allinone

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import kotlinx.android.synthetic.main.activity_videoplayer.*

class videoplayer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_videoplayer)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoview)
        val onlineuri = Uri.parse("http://videocdn.bodybuilding.com/video/mp4/62000/62792m.mp4")
        videoview.setMediaController(mediaController)
        videoview.setVideoURI(onlineuri)
        videoview.requestFocus()
        videoview.start()
    }
}