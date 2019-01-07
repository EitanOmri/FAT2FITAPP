package com.fat2fit.fat2fitapp;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView ob = new WebView(this);
        ob.getSettings().setJavaScriptEnabled(true);
        ob.getSettings().setAllowFileAccess(true);
        ob.getSettings().setAppCacheEnabled(true);
        ob.loadUrl("http://10.0.2.2:63343/FAT2FITClient/Login.html");
        ob.getSettings().setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        //opens all link in the same web view instead of the default browser
        ob.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(request.getUrl().toString());
                return false;
            }
        });
        setContentView(ob);
    }
}
