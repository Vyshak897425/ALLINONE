package com.example.allinone.activities

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import com.example.allinone.R
import kotlinx.android.synthetic.main.activity_webview.*

class Webview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)
        webViewSetup()

    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun webViewSetup() {
        webview.webViewClient = WebViewClient()
        webview.apply {
            loadUrl("https://www.google.com/")
            settings.javaScriptEnabled = true
        }
    }
}