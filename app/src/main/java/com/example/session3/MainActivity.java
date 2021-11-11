package com.example.session3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.tv.TvView;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView vview =findViewById(R.id.vview);
        String url ="https://www.aparat.com/v/UF1gn/%D8%A7%D9%86%D8%A8%D8%A7%DA%A9%D8%B3%DB%8C%D9%86%DA%AF_unboxing_Poco_x3_NFC";
        vview.setVideoURI(Uri.parse((url)));
        vview.setMediaController(new MediaController(MainActivity.this));
        vview.start();

        WebView wview = findViewById(R.id.wview);
        wview.getSettings().setJavaScriptEnabled(true);
        wview.setWebViewClient(new WebViewClient());
        wview.loadUrl("http://www.yahoo.com");
    }
}