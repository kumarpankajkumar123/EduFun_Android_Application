package com.example.project_one.all_getter_seetter_classes;

public class Alphabet_get_set {
    int img;
    String text;

    public Alphabet_get_set(int img, String text){
        this.img = img;
        this.text = text;
    }

    public int getImg(){
        return img;
    }
    public void setImg(int img){
        this.img = img;
    }

    public String getText(){
        return text;
    }
    public  void setText(String text){
        this.text = text;
    }
}

