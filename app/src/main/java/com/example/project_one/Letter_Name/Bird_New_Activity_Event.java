package com.example.project_one.Letter_Name;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.project_one.R;

public class Bird_New_Activity_Event extends AppCompatActivity {

    ImageView Bird_event_image;
    TextView Bird_event_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bird_new_event);

        Bird_event_image = (ImageView) findViewById(R.id.Bird_event_image);
        Bird_event_text = (TextView) findViewById(R.id.Bird_event_text);

        int int_img = getIntent().getIntExtra("image_bird",0);
        Bird_event_text.setText(getIntent().getExtras().getString("text_bird"));
        Bird_event_image.setImageResource(int_img);
        getSupportActionBar().hide();
    }
}