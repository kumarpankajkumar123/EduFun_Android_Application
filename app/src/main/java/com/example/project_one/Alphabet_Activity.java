package com.example.project_one;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;

import com.example.project_one.all_Adaptor_classes.Alphabet_class;
import com.example.project_one.all_getter_seetter_classes.Alphabet_get_set;

import java.util.ArrayList;

public class Alphabet_Activity extends AppCompatActivity {

    RecyclerView recycle_alphabet;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);

        recycle_alphabet = (RecyclerView) findViewById(R.id.recycle_alphabet);

        getSupportActionBar().hide();

        mediaPlayer = MediaPlayer.create(this,R.raw.alphabetsmp);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();

        ArrayList<Alphabet_get_set> list = new ArrayList<>();

        list.add(new Alphabet_get_set(R.drawable.applegif,"A for apple"));
        list.add(new Alphabet_get_set(R.drawable.boygif,"B for Boy"));
        list.add(new Alphabet_get_set(R.drawable.catgif,"C for Cat"));
        list.add(new Alphabet_get_set(R.drawable.doggif,"D for Dog"));
        list.add(new Alphabet_get_set(R.drawable.elephantgif,"E for Elephent"));
        list.add(new Alphabet_get_set(R.drawable.fishgif,"F for Fish"));
        list.add(new Alphabet_get_set(R.drawable.girlgif,"G for Girl"));
        list.add(new Alphabet_get_set(R.drawable.horsegif,"H for Horse"));
        list.add(new Alphabet_get_set(R.drawable.icecreamgif,"I for Ice-Cream"));
        list.add(new Alphabet_get_set(R.drawable.jokergif,"J for Joker"));
        list.add(new Alphabet_get_set(R.drawable.kitegif,"K for Kite"));
        list.add(new Alphabet_get_set(R.drawable.liongif,"L for Lion"));
        list.add(new Alphabet_get_set(R.drawable.mangogif,"M for Mango"));
        list.add(new Alphabet_get_set(R.drawable.nestgif,"N for Nest"));
        list.add(new Alphabet_get_set(R.drawable.orangegif,"O for Orange"));
        list.add(new Alphabet_get_set(R.drawable.parrotgif,"P for Parrot"));
        list.add(new Alphabet_get_set(R.drawable.queengif,"Q for Queen"));
        list.add(new Alphabet_get_set(R.drawable.ratgif,"R for Rat"));
        list.add(new Alphabet_get_set(R.drawable.shipgif,"S for Ship"));
        list.add(new Alphabet_get_set(R.drawable.tigergif,"T for Tiger"));
        list.add(new Alphabet_get_set(R.drawable.umberellagif,"U for Umbrella"));
        list.add(new Alphabet_get_set(R.drawable.vangif,"V for Van"));
        list.add(new Alphabet_get_set(R.drawable.watchgif,"W for Watch"));
        list.add(new Alphabet_get_set(R.drawable.xraygif,"X for X-ray"));
        list.add(new Alphabet_get_set(R.drawable.yakgif,"Y for Yak"));
        list.add(new Alphabet_get_set(R.drawable.zebragif,"Z for Zebra"));


        Alphabet_class adaptor = new Alphabet_class(list,this);
        recycle_alphabet.setAdapter(adaptor);

        GridLayoutManager gridlayout = new GridLayoutManager(this, 2);
        recycle_alphabet.setLayoutManager(gridlayout);

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