package com.example.project_one.Letter_Name;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.project_one.R;

public class Vegetable_New_Activity_Event extends AppCompatActivity {
    ImageView Vegetable_event_image;
    TextView Vegetable_event_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetable_new_event);

        Vegetable_event_image = (ImageView) findViewById(R.id.Vegetable_event_image);
        Vegetable_event_text = (TextView) findViewById(R.id.Vegetable_event_text);

        int int_img = getIntent().getIntExtra("image_vegetable",0);
        Vegetable_event_text.setText(getIntent().getExtras().getString("text_vegetable"));
        Vegetable_event_image.setImageResource(int_img);
        getSupportActionBar().hide();
    }
}