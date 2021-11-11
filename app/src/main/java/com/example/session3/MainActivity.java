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
        String url ="https://hajifirouz5.cdn.asset.aparat.com/aparat-video/07b39a1dcde8485fe330b3050f2e456539429265-480p.mp4?wmsAuthSign=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0b2tlbiI6IjFhOTU4ZjhhNWY5MTY1YTc4MTQ0ZGZjNjRhMTA1OTU2IiwiZXhwIjoxNjM2NjQ2MTI1LCJpc3MiOiJTYWJhIElkZWEgR1NJRyJ9.3NjIGvZGTZbnJY9PXb5-2dex1E7CHh3VFCAyN6NNcMo";
        vview.setVideoURI(Uri.parse((url)));
        //vview.setMediaController(new MediaController(MainActivity.this));
        vview.start();

        WebView wview = findViewById(R.id.wview);
        wview.getSettings().setJavaScriptEnabled(true);
        wview.setWebViewClient(new WebViewClient());
        wview.loadUrl("https://cinematicket.org/");
    }
}