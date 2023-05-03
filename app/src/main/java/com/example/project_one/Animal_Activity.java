package com.example.project_one;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;

import com.example.project_one.all_Adaptor_classes.Animal;
import com.example.project_one.all_getter_seetter_classes.Animal_get_set;

import java.util.ArrayList;

public class Animal_Activity extends AppCompatActivity {

    RecyclerView animal_recycle;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);

        animal_recycle = (RecyclerView) findViewById(R.id.animal_recycle);

        getSupportActionBar().hide();

        mediaPlayer = MediaPlayer.create(this,R.raw.animalbackground);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();




        ArrayList<Animal_get_set> list = new ArrayList<>();

        list.add(new Animal_get_set(R.drawable.cowgif,"Cow"));
        list.add(new Animal_get_set(R.drawable.catgif,"Cat"));
        list.add(new Animal_get_set(R.drawable.elephantgif,"Elephent"));
        list.add(new Animal_get_set(R.drawable.doggif,"Dog"));
        list.add(new Animal_get_set(R.drawable.horsegif,"Horse"));
        list.add(new Animal_get_set(R.drawable.liongif1,"Lion"));
        list.add(new Animal_get_set(R.drawable.tigergif,"Tiger"));
        list.add(new Animal_get_set(R.drawable.yakgif,"Yak"));
        list.add(new Animal_get_set(R.drawable.zebragif,"Zebra"));
        list.add(new Animal_get_set(R.drawable.goatgif,"Goat"));
        list.add(new Animal_get_set(R.drawable.piggif,"Pig"));
        list.add(new Animal_get_set(R.drawable.monkeygif,"Monkey"));
        list.add(new Animal_get_set(R.drawable.foxgif,"Fox"));
        list.add(new Animal_get_set(R.drawable.donkeygif,"Donkey"));
        list.add(new Animal_get_set(R.drawable.deergif,"Deer"));
        list.add(new Animal_get_set(R.drawable.camelgif,"Camel"));
        list.add(new Animal_get_set(R.drawable.beargif,"Bear"));
        list.add(new Animal_get_set(R.drawable.giraffegif,"Giraffe"));
        list.add(new Animal_get_set(R.drawable.squirrelgif,"Squirrel"));



        Animal adaptor = new Animal(list , this);
        animal_recycle.setAdapter(adaptor);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        animal_recycle.setLayoutManager(gridLayoutManager);
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
        mediaPlayer.release();
    }
}