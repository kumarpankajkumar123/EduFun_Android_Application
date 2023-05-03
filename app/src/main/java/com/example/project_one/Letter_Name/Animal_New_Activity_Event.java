package com.example.project_one.Letter_Name;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.project_one.R;

public class Animal_New_Activity_Event extends AppCompatActivity {

    ImageView Animal_event_image;
    TextView Animal_event_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_new_event);
        Animal_event_image = (ImageView) findViewById(R.id.Animal_event_image);
        Animal_event_text = (TextView) findViewById(R.id.Animal_event_text);

        int int_image = getIntent().getIntExtra("image",0);
        Animal_event_text.setText(getIntent().getExtras().getString("text"));
        Animal_event_image.setImageResource(int_image);

        getSupportActionBar().hide();
    }
}