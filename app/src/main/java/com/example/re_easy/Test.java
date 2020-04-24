package com.example.re_easy;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class Test extends AppCompatActivity {

    public void onCreate(Bundle bd){
        super.onCreate(bd);
        setContentView(R.layout.test);
        WebView wb = findViewById(R.id.testVidWeb);
        wb.setWebViewClient(new WebViewClient());
        WebSettings webSettings = wb.getSettings();
        webSettings.setJavaScriptEnabled(true);

        wb.loadUrl("file:///android_asset/www/metal.html");
    }
}
