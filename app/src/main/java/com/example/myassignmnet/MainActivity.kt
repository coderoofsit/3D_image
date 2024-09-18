package com.example.myassignmnet

import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.webview)
        webView.webViewClient = WebViewClient() // Prevents opening links in the browser

        // Enable JavaScript
        val webSettings: WebSettings = webView.settings
        webSettings.javaScriptEnabled = true

        // Load a URL
        webView.loadUrl("https://tangerine-scone-ce5ee3.netlify.app/")
    }

    override fun onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack() // If there's history, go back to the previous page
        } else {
            super.onBackPressed() // Otherwise, exit the app
        }
    }
}
