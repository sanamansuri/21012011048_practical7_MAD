package com.example.a21012011048

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class activity_main_youtube : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_youtube)
        val youtubeid="fJn9B64Znrk"
        val mywebview=findViewById<WebView>(R.id.webview1)
        val webSettings=mywebview.settings
        webSettings.javaScriptEnabled=true
        webSettings.loadWithOverviewMode=true
        webSettings.useWideViewPort=true
        mywebview.loadUrl("https//:www.youtube.com/embed/$youtubeid")
    }
}