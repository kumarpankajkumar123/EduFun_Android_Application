package com.example.project_one.all_Adaptor_classes;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_one.Letter_Name.Animal_New_Activity_Event;
import com.example.project_one.R;
import com.example.project_one.all_getter_seetter_classes.Animal_get_set;

import java.util.ArrayList;

public class Animal extends RecyclerView.Adapter<Animal.Viewholder> {
  int last_position = -1;
    Context context;
    ArrayList<Animal_get_set> list;

    public Animal(ArrayList<Animal_get_set> list , Context context){
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.animal_design_recycle,parent,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        Animal_get_set modal = list.get(position);
        holder.imageView.setImageResource(modal.getImg_animal());
        holder.textView.setText(modal.getText_animal());

        Rv_Animation(holder.itemView,position);

        holder.animal_card_event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Animal_New_Activity_Event.class);
                intent.putExtra("image",modal.getImg_animal());
                intent.putExtra("text",modal.getText_animal());
                v.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class Viewholder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        CardView animal_card_event;
        MediaPlayer mediaPlayer;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.animal_image);
            textView = (TextView) itemView.findViewById(R.id.animal_text);
            animal_card_event = (CardView) itemView.findViewById(R.id.animal_card_event);

        }
    }

    public void Rv_Animation(View view,int position){
        if(last_position < position){
            Animation animation= AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
            view.startAnimation(animation);
            last_position = position;
        }
    }

}
