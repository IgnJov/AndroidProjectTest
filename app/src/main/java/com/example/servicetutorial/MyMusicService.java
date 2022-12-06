package com.example.servicetutorial;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class MyMusicService extends Service {
    MediaPlayer mp;



    public MyMusicService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        Toast.makeText(this, "Hello world", Toast.LENGTH_LONG).show();
        mp = MediaPlayer.create(this, R.raw.music);
        mp.setLooping(true);
    }

    @Override
    public void onStart(Intent intent, int startId) {
        mp.start();
    }

    @Override
    public void onDestroy() {
        mp.stop();
    }
}