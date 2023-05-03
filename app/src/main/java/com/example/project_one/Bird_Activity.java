package com.example.project_one;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;

import com.example.project_one.all_Adaptor_classes.Bird;
import com.example.project_one.all_getter_seetter_classes.Bird_get_set;

import java.util.ArrayList;

public class Bird_Activity extends AppCompatActivity {

    RecyclerView bird_recyle;
    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bird);

        bird_recyle = (RecyclerView) findViewById(R.id.bird_recyle);

        getSupportActionBar().hide();


        mediaPlayer = MediaPlayer.create(this,R.raw.birdsoundone);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();

        ArrayList<Bird_get_set> list = new ArrayList<>();

        list.add(new Bird_get_set(R.drawable.crowgif,"Crow"));
        list.add(new Bird_get_set(R.drawable.cockgif,"Cock"));
        list.add(new Bird_get_set(R.drawable.peacockgif,"Peacock"));
        list.add(new Bird_get_set(R.drawable.kingfishergif,"Kingfisher"));
        list.add(new Bird_get_set(R.drawable.pigeongif,"Pigeon"));
        list.add(new Bird_get_set(R.drawable.owlgif,"Owl"));
        list.add(new Bird_get_set(R.drawable.parrotgif,"parrot"));
        list.add(new Bird_get_set(R.drawable.sparrowgif,"Sparrow"));
        list.add(new Bird_get_set(R.drawable.swangif,"Swan"));
        list.add(new Bird_get_set(R.drawable.eaglegif,"Eagle"));
        list.add(new Bird_get_set(R.drawable.vulturegif,"Vulture"));
        list.add(new Bird_get_set(R.drawable.cranegif,"Crane"));
        list.add(new Bird_get_set(R.drawable.woodpeckergif,"Woodpecker"));
        list.add(new Bird_get_set(R.drawable.batgif,"Bat"));
        list.add(new Bird_get_set(R.drawable.penguingif,"Penguin"));



        Bird adaptor = new Bird(list , this);
        bird_recyle.setAdapter(adaptor);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        bird_recyle.setLayoutManager(gridLayoutManager);
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