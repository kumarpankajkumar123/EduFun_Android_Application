package com.example.project_one.Letter_Name;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.project_one.R;

public class Flower_New_Activity_Event extends AppCompatActivity {

    ImageView Flower_event_image;
    TextView Flower_event_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower_new_event);

        Flower_event_image = (ImageView) findViewById(R.id.Flower_event_image);
        Flower_event_text = (TextView) findViewById(R.id.Flower_event_text);

        int int_img = getIntent().getIntExtra("image_flower",0);
        Flower_event_text.setText(getIntent().getExtras().getString("text_flower"));
        Flower_event_image.setImageResource(int_img);

        getSupportActionBar().hide();
    }
}