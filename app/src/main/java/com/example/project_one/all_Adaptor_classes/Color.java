package com.example.project_one.all_Adaptor_classes;

import android.content.Context;
import android.content.Intent;
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

import com.example.project_one.Letter_Name.Color_New_Activity_Event;
import com.example.project_one.R;
import com.example.project_one.all_getter_seetter_classes.Color_get_set;
import com.example.project_one.all_getter_seetter_classes.Number_get_set;

import java.util.ArrayList;

public class Color extends RecyclerView.Adapter<Color.Viewholder> {

    int last_position = -1;

    Context context;
    ArrayList<Color_get_set> list;

    public Color(ArrayList<Color_get_set> list, Context context) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.color_design_recycle, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Color.Viewholder holder, int position) {
        Color_get_set modal = list.get(position);
        holder.imageView.setImageResource(modal.getImg());
        holder.textView.setText(modal.getText());

        Rv_Animation(holder.itemView,position);

        holder.Color_card_event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Color_New_Activity_Event.class);
                intent.putExtra("image_color",modal.getImg());
                intent.putExtra("text_color",modal.getText());
                v.getContext().startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;
        CardView Color_card_event;

        public Viewholder(@NonNull View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.color_sample_image);
            textView = (TextView) itemView.findViewById(R.id.color_one_text);

            Color_card_event = (CardView) itemView.findViewById(R.id.Color_card_event);
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

