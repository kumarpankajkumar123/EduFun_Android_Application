package com.example.project_one.Letter_Name;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.project_one.R;

public class Number_New_Activity_Event extends AppCompatActivity {

    ImageView Number_event_image;
    TextView Number_event_text;
    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_new_event);

        mediaPlayer = MediaPlayer.create(this,R.raw.splashbackground);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();

        Number_event_image = (ImageView) findViewById(R.id.Number_event_image);
        Number_event_text = (TextView) findViewById(R.id.Number_event_text);

        int int_img = getIntent().getIntExtra("image_number",0);
        Number_event_text.setText(getIntent().getExtras().getString("text_number"));
        Number_event_image.setImageResource(int_img);
        getSupportActionBar().hide();
    }
    @Override
    protected void onPause(){
        super.onPause();
        mediaPlayer.pause();
    }

    @Override
    protected void onResume(){
        super.onResume();
        mediaPlayer.start();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        mediaPlayer.stop();
    }
}