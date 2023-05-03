package com.example.project_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash_screen extends AppCompatActivity {
    ImageView bouncing_img;
    TextView textView;

    MediaPlayer player;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        bouncing_img = (ImageView) findViewById(R.id.bouncing_img);
        textView = (TextView)findViewById(R.id.text_view);
        Animation animation =AnimationUtils.loadAnimation(Splash_screen.this,R.anim.fedein);
        bouncing_img.startAnimation(animation);
        textView.startAnimation(animation);

        player = MediaPlayer.create(this,R.raw.splashbackground1);
        player.start();

        getSupportActionBar().hide();

       handler = new Handler();
       handler.postDelayed(new Runnable() {
           @Override
           public void run() {
               player.stop();
               player.release();

               Intent intent = new Intent(Splash_screen.this,first_Activity.class);
               startActivity(intent);
               finish();
           }
       },2500);

    }

}

