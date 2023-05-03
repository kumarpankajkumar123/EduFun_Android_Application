package com.example.project_one;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class first_Activity extends AppCompatActivity {

     CardView cardView;

     MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        getSupportActionBar().hide();

        mediaPlayer = MediaPlayer.create(this,R.raw.backgroundmusic);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();

        cardView = (CardView) findViewById(R.id.alphabet_first);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(first_Activity.this, Alphabet_Activity.class);
                startActivity(intent);

            }
        });

        cardView = (CardView) findViewById(R.id.counting_first);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(first_Activity.this , Numbers_Activity.class);
                startActivity(intent);

            }
        });

        cardView = (CardView) findViewById(R.id.color_first);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(first_Activity.this,Color_Activity.class);
                startActivity(intent);

            }
        });

        cardView = (CardView) findViewById(R.id.Fruits_first);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(first_Activity.this, Fruits_Activity.class);
                startActivity(intent);

            }
        });


        cardView = (CardView) findViewById(R.id.vegetable_first);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(first_Activity.this , Vegetable_Activity.class);
                startActivity(intent);
            }
        });

        cardView = (CardView) findViewById(R.id.flower_first);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(first_Activity.this,Flower_Activity.class);
                startActivity(intent);
            }
        });

        cardView = (CardView) findViewById(R.id.bird_first);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(first_Activity.this,Bird_Activity.class);
                startActivity(intent);
            }
        });

        cardView = (CardView) findViewById(R.id.animal_first);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(first_Activity.this,Animal_Activity.class);
                startActivity(intent);
            }
        });

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