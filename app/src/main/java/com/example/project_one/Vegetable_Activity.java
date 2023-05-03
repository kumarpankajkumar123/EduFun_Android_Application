package com.example.project_one;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;

import com.example.project_one.all_Adaptor_classes.Vegetable;
import com.example.project_one.all_getter_seetter_classes.Fruits_get_set;
import com.example.project_one.all_getter_seetter_classes.Vegetabe_get_set;

import java.util.ArrayList;

public class Vegetable_Activity extends AppCompatActivity {

    RecyclerView vegetable_recycle;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetable);

        vegetable_recycle = (RecyclerView) findViewById(R.id.vegetable_recycle);

        getSupportActionBar().hide();

        mediaPlayer = MediaPlayer.create(this,R.raw.vegetablemp);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();


        ArrayList<Vegetabe_get_set> list = new ArrayList<>();

        list.add(new Vegetabe_get_set(R.drawable.potatogif,"Potato"));
        list.add(new Vegetabe_get_set(R.drawable.oniongif,"Onion"));
        list.add(new Vegetabe_get_set(R.drawable.tomatogif,"Tomato"));
        list.add(new Vegetabe_get_set(R.drawable.gingergif,"Ginger"));
        list.add(new Vegetabe_get_set(R.drawable.ladyfingergif,"Ladyfinger"));
        list.add(new Vegetabe_get_set(R.drawable.brinjalgif,"Brinjal"));
        list.add(new Vegetabe_get_set(R.drawable.broccoligif,"Broccoli"));
        list.add(new Vegetabe_get_set(R.drawable.cabbagegif,"Cabbage"));
        list.add(new Vegetabe_get_set(R.drawable.carrotgif,"Carrot"));
        list.add(new Vegetabe_get_set(R.drawable.radishgif,"radish"));
        list.add(new Vegetabe_get_set(R.drawable.capsicumgif,"Capsicum"));
        list.add(new Vegetabe_get_set(R.drawable.cauliflowergif,"Cauliflower"));
        list.add(new Vegetabe_get_set(R.drawable.chilligif,"Chilli"));
        list.add(new Vegetabe_get_set(R.drawable.corngif,"Corn"));
        list.add(new Vegetabe_get_set(R.drawable.cucumbergif,"Cucumber"));
        list.add(new Vegetabe_get_set(R.drawable.peagif,"Pea"));
        list.add(new Vegetabe_get_set(R.drawable.pumpkingif,"Pumpkin"));



        Vegetable adaptor = new Vegetable(list,this);
        vegetable_recycle.setAdapter(adaptor);


        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        vegetable_recycle.setLayoutManager(gridLayoutManager);

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