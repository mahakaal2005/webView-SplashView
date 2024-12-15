package com.example.web_view_and_splash_screen

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val web1:WebView=findViewById(R.id.wb1)

        web1.loadUrl("https://github.com/")
        web1.settings.javaScriptEnabled =true
        web1.webViewClient= WebViewClient() //it is setup taki website puri ki puri app pr hi chale agar ye ni krege to homepage to load hoga baki sari functionalities ke liye vo browser load krega
    }
}