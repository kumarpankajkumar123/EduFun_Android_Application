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

import com.example.project_one.Letter_Name.A_classes_Activity;
import com.example.project_one.R;
import com.example.project_one.all_getter_seetter_classes.Alphabet_get_set;

import java.util.ArrayList;

public class Alphabet_class extends RecyclerView.Adapter<Alphabet_class.Viewholder> {

  MediaPlayer mediaPlayer;
  int last_position = -1;
  Context context;
  ArrayList<Alphabet_get_set> list;

  public Alphabet_class(ArrayList<Alphabet_get_set> list, Context context) {
    this.context = context;
    this.list = list;
  }

  @NonNull
  @Override
  public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(context).inflate(R.layout.alphabet_design_recycle, parent, false);
    return new Viewholder(view);

  }

  @Override
  public void onBindViewHolder(@NonNull Viewholder holder, int position) {

    Alphabet_get_set model = list.get(position);
    holder.imageView.setImageResource(model.getImg());
    holder.textView.setText(model.getText());

    Rv_Animation(holder.itemView, position);

    holder.alphabet_card_event.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(v.getContext(), A_classes_Activity.class);
        intent.putExtra("image", model.getImg());
        intent.putExtra("text", model.getText());
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

    CardView alphabet_card_event;


    public  Viewholder(@NonNull View itemView) {
      super(itemView);

      imageView = (ImageView) itemView.findViewById(R.id.alphabet_sample_image);
      textView = (TextView) itemView.findViewById(R.id.sample_alphabet_text);

      alphabet_card_event = (CardView) itemView.findViewById(R.id.alphabet_card_event);
//      img = itemView.findViewById(R.id.A_image);
//      img.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//          mediaPlayer.start();
//        }
//      });
    }
  }

  public void Rv_Animation(View view, int position) {
//    Animation animation= AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
//    view.startAnimation(animation);

    if (last_position < position) {
      Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
      view.startAnimation(animation);
      last_position = position;
    }
  }
}


