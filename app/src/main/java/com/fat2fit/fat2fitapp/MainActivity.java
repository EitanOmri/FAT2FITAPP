package com.fat2fit.fat2fitapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView ob = new WebView(this);
        ob.getSettings().setJavaScriptEnabled(true);
        ob.loadUrl("https://www.google.com/");
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
