package com.hisham.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.MediaController;
import android.widget.VideoView;

public class videoScreen extends AppCompatActivity {
    VideoView shwVideo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_screen);

        shwVideo = (VideoView) findViewById(R.id.videoView);


        MediaController media123 = new MediaController(this);
        Uri loc123 = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.fishpond);
        shwVideo.setMediaController(media123);
        shwVideo.setVideoURI(loc123);
        shwVideo.requestFocus(); // request focus use is unknown
        shwVideo.start();

    }
}