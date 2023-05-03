package com.example.project_one;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;

import com.example.project_one.all_Adaptor_classes.Alphabet_class;
import com.example.project_one.all_Adaptor_classes.Number;
import com.example.project_one.all_getter_seetter_classes.Alphabet_get_set;
import com.example.project_one.all_getter_seetter_classes.Number_get_set;

import java.util.ArrayList;

public class Numbers_Activity extends AppCompatActivity {

    RecyclerView recycle_number;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        recycle_number = (RecyclerView) findViewById(R.id.recycle_number);

        getSupportActionBar().hide();

        mediaPlayer = MediaPlayer.create(this,R.raw.numbersmp);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();

        ArrayList<Number_get_set> list = new ArrayList<>();


        list.add(new Number_get_set(R.drawable.one1,"One"));
        list.add(new Number_get_set(R.drawable.two1,"Two"));
        list.add(new Number_get_set(R.drawable.three1,"Three"));
        list.add(new Number_get_set(R.drawable.four1,"Four"));
        list.add(new Number_get_set(R.drawable.five1,"Five"));
        list.add(new Number_get_set(R.drawable.six,"Six"));
        list.add(new Number_get_set(R.drawable.seven,"Seven"));
        list.add(new Number_get_set(R.drawable.eight,"Eight"));
        list.add(new Number_get_set(R.drawable.nine,"Nine"));
        list.add(new Number_get_set(R.drawable.ten,"Ten"));
        list.add(new Number_get_set(R.drawable.eleven,"Eleven"));
        list.add(new Number_get_set(R.drawable.twelve,"Twelve"));
        list.add(new Number_get_set(R.drawable.thirteen,"Thirteen"));
        list.add(new Number_get_set(R.drawable.fourteen,"Fourteen"));
        list.add(new Number_get_set(R.drawable.fifteen,"Fifteen"));
        list.add(new Number_get_set(R.drawable.sixteen,"Sixteen"));
        list.add(new Number_get_set(R.drawable.seventeen,"Seventeen"));
        list.add(new Number_get_set(R.drawable.eighteen,"Eighteen"));
        list.add(new Number_get_set(R.drawable.nineteen,"Nineteen"));
        list.add(new Number_get_set(R.drawable.twenty,"Twenty"));


        Number adaptor = new Number(list,this);
        recycle_number.setAdapter(adaptor);

        GridLayoutManager gridlayout = new GridLayoutManager(this, 2);
        recycle_number.setLayoutManager(gridlayout);
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