package com.example.udemyuseaudio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    MediaPlayer player;
    Button playButton;
    SeekBar progressBar;
    AudioManager audioManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);

        player = MediaPlayer.create(getApplicationContext(), R.raw.original);
        playButton = findViewById(R.id.playButton);

        progressBar = findViewById(R.id.volumeBar);
        progressBar.setMax(player.getDuration());

        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                progressBar.setProgress(player.getCurrentPosition());
            }
        }, 0, 1000);
    }

    public void togglePlay(View view) {
        if (player.isPlaying()) {
            player.pause();
            playButton.setBackgroundResource(R.drawable.play_btn);
        } else {
            player.start();
            playButton.setBackgroundResource(R.drawable.pause_btn);
        }
    }

    public void prevTrack(View view) {
    }

    public void nextTrack(View view) {
    }
}