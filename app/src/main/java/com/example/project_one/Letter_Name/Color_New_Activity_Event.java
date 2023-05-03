package com.example.project_one.Letter_Name;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.project_one.R;

public class Color_New_Activity_Event extends AppCompatActivity {

    ImageView Color_event_image;
    TextView Color_event_text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_new_event);

        Color_event_image = (ImageView) findViewById(R.id.Color_event_image);
        Color_event_text = (TextView) findViewById(R.id.Color_event_text);

        int int_img = getIntent().getIntExtra("image_color",0);
        Color_event_text.setText(getIntent().getExtras().getString("text_color"));
        Color_event_image.setImageResource(int_img);
        getSupportActionBar().hide();
    }
}