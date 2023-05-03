package com.example.project_one;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;

import com.example.project_one.all_Adaptor_classes.Color;
import com.example.project_one.all_Adaptor_classes.Number;
import com.example.project_one.all_getter_seetter_classes.Color_get_set;
import com.example.project_one.all_getter_seetter_classes.Number_get_set;

import java.util.ArrayList;

public class Color_Activity extends AppCompatActivity {

    RecyclerView recycle_color;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        recycle_color = (RecyclerView) findViewById(R.id.recycle_color);

        getSupportActionBar().hide();

        mediaPlayer = MediaPlayer.create(this,R.raw.colorsmp);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();

        ArrayList<Color_get_set> list = new ArrayList<>();

        list.add(new Color_get_set(R.drawable.red,"Red"));
        list.add(new Color_get_set(R.drawable.orangeone,"Orange"));
        list.add(new Color_get_set(R.drawable.yellow,"Yellow"));
        list.add(new Color_get_set(R.drawable.black,"Black"));
        list.add(new Color_get_set(R.drawable.blue,"Blue"));
        list.add(new Color_get_set(R.drawable.green,"Green"));
        list.add(new Color_get_set(R.drawable.purple,"Purple"));
        list.add(new Color_get_set(R.drawable.pink,"Pink"));
        list.add(new Color_get_set(R.drawable.voilet,"Violet"));
        list.add(new Color_get_set(R.drawable.brown,"Brown"));
        list.add(new Color_get_set(R.drawable.olive,"Olive"));
        list.add(new Color_get_set(R.drawable.grey,"Grey"));
        list.add(new Color_get_set(R.drawable.maroon,"Marron"));
        list.add(new Color_get_set(R.drawable.indigo,"Indigo"));
        list.add(new Color_get_set(R.drawable.aqua,"Aqua"));
        list.add(new Color_get_set(R.drawable.cream,"Cream"));




        Color adaptor = new Color(list,this);
        recycle_color.setAdapter(adaptor);

        GridLayoutManager gridlayout = new GridLayoutManager(this, 2);
        recycle_color.setLayoutManager(gridlayout);

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