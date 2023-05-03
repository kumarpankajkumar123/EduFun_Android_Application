package com.example.project_one.Letter_Name;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.project_one.R;

public class A_classes_Activity extends AppCompatActivity {

    MediaPlayer player;

    public void play(View view){
        player.start();
    }
    ImageView A_image;
    TextView A_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aclasses);
        A_image = (ImageView) findViewById(R.id.A_image);
        A_text = (TextView) findViewById(R.id.A_text);

        int int_image = getIntent().getIntExtra("image",0);
        A_text.setText(getIntent().getExtras().getString("text"));
        A_image.setImageResource(int_image);
        getSupportActionBar().hide();


        player = MediaPlayer.create(this,R.raw.a);
    }
}