package com.example.project_one;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;

import com.example.project_one.all_Adaptor_classes.Fruits;
import com.example.project_one.all_getter_seetter_classes.Fruits_get_set;
import com.example.project_one.all_getter_seetter_classes.Number_get_set;

import java.util.ArrayList;

public class Fruits_Activity extends AppCompatActivity {

    RecyclerView recycle_fruits;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);

        recycle_fruits = (RecyclerView) findViewById(R.id.recycle_fruits);

        getSupportActionBar().hide();

        mediaPlayer = MediaPlayer.create(this,R.raw.fruitsmp);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();

        ArrayList<Fruits_get_set> list = new ArrayList<>();

        list.add(new Fruits_get_set(R.drawable.applegif,"Apple"));
        list.add(new Fruits_get_set(R.drawable.mangogif,"Mango"));
        list.add(new Fruits_get_set(R.drawable.guavagif,"Guava"));
        list.add(new Fruits_get_set(R.drawable.pineapplegif,"Pineapple"));
        list.add(new Fruits_get_set(R.drawable.litchigif,"Litchi"));
        list.add(new Fruits_get_set(R.drawable.stawberrygif,"Stawbeery"));
        list.add(new Fruits_get_set(R.drawable.grapesgif,"Grapes"));
        list.add(new Fruits_get_set(R.drawable.bananagif,"Banana"));
        list.add(new Fruits_get_set(R.drawable.watermelongif,"Watermelon"));
        list.add(new Fruits_get_set(R.drawable.orangegif,"Orange"));




       Fruits adapter = new Fruits(list , this);
       recycle_fruits.setAdapter(adapter);


        GridLayoutManager gridlayout = new GridLayoutManager(this, 2);
        recycle_fruits.setLayoutManager(gridlayout);

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