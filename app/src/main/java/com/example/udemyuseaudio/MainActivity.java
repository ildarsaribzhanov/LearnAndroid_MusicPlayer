package com.example.udemyuseaudio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player = MediaPlayer.create(getApplicationContext(), R.raw.original);
    }

    public void togglePlay(View view) {
        player.start();
    }

    public void pause(View view) {
        player.pause();
    }
}