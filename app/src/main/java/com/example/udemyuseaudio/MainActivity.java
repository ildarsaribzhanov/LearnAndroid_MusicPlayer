package com.example.udemyuseaudio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer player;
    Button playButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player = MediaPlayer.create(getApplicationContext(), R.raw.original);
        playButton = findViewById(R.id.playButton);
    }

    public void togglePlay(View view) {
        if (player.isPlaying()) {
            player.pause();
            playButton.setText("Play");
        } else  {
            player.start();
            playButton.setText("Pause");
        }
    }
}