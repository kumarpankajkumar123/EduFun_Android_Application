package com.example.project_one.Letter_Name;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.project_one.R;

public class Fruit_New_Activity_Event extends AppCompatActivity {
    ImageView Fruit_event_image;
    TextView Fruit_event_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit_new_event);

        Fruit_event_image = (ImageView) findViewById(R.id.Fruit_event_image);
        Fruit_event_text = (TextView) findViewById(R.id.Fruit_event_text);

        int int_img = getIntent().getIntExtra("image_fruit",0);
        Fruit_event_text.setText(getIntent().getExtras().getString("text_fruit"));
        Fruit_event_image.setImageResource(int_img);
        getSupportActionBar().hide();
    }
}