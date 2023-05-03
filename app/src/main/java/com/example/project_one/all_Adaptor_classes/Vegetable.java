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

import com.example.project_one.Letter_Name.Vegetable_New_Activity_Event;
import com.example.project_one.R;
import com.example.project_one.all_getter_seetter_classes.Vegetabe_get_set;

import java.util.ArrayList;

public class Vegetable extends RecyclerView.Adapter<Vegetable.Viewholder> {

    int last_position = -1;
    Context context;
    ArrayList<Vegetabe_get_set> list;

    public Vegetable(ArrayList<Vegetabe_get_set> list , Context context){
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.vegetable_design_recycle,parent,false);
        return new Viewholder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
      Vegetabe_get_set modal = list.get(position);
      holder.imageView.setImageResource(modal.getImg_veg());
      holder.textView.setText(modal.getText_veg());

        Rv_Animation(holder.itemView,position);

      holder.vegetable_card_event.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(v.getContext(), Vegetable_New_Activity_Event.class);
              intent.putExtra("image_vegetable",modal.getImg_veg());
              intent.putExtra("text_vegetable",modal.getText_veg());
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

        CardView vegetable_card_event;
        public Viewholder(@NonNull View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.vegetable_image);
            textView = (TextView) itemView.findViewById(R.id.vegetable_text);
            vegetable_card_event = (CardView) itemView.findViewById(R.id.vegetable_card_event);
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
