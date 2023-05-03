package com.example.project_one;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;

import com.example.project_one.all_Adaptor_classes.Flower;
import com.example.project_one.all_getter_seetter_classes.Flower_get_set;

import java.util.ArrayList;

public class Flower_Activity extends AppCompatActivity {

    RecyclerView flower_recycle;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower);

        flower_recycle = (RecyclerView) findViewById(R.id.flower_recycle);

        getSupportActionBar().hide();

        mediaPlayer = MediaPlayer.create(this,R.raw.flowermp);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();

        ArrayList<Flower_get_set> list = new ArrayList<>();

        list.add(new Flower_get_set(R.drawable.daisy,"Daisy"));
        list.add(new Flower_get_set(R.drawable.tulipgif,"Tulip"));
        list.add(new Flower_get_set(R.drawable.sunflowergif,"Sunflower"));
        list.add(new Flower_get_set(R.drawable.marigoldgif,"Marigold"));
        list.add(new Flower_get_set(R.drawable.hibiscusgif,"Hibiscus"));
        list.add(new Flower_get_set(R.drawable.jasminegif,"Jasmine"));
        list.add(new Flower_get_set(R.drawable.lavendergif,"Lavender"));
        list.add(new Flower_get_set(R.drawable.lilygif,"Lily"));
        list.add(new Flower_get_set(R.drawable.lotusgif,"Lotus"));
        list.add(new Flower_get_set(R.drawable.rosegif,"Rose"));
        list.add(new Flower_get_set(R.drawable.dahliagif,"Dahlia"));
        list.add(new Flower_get_set(R.drawable.astergif,"Aster"));
        list.add(new Flower_get_set(R.drawable.bluebellgif,"Bluebell"));
        list.add(new Flower_get_set(R.drawable.orchidgif,"Orchid"));
        list.add(new Flower_get_set(R.drawable.flaxgif,"Flax"));
        list.add(new Flower_get_set(R.drawable.plumeriagif,"Plumeria"));





        Flower adaptor = new Flower(list,this);
        flower_recycle.setAdapter(adaptor);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        flower_recycle.setLayoutManager(gridLayoutManager);
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