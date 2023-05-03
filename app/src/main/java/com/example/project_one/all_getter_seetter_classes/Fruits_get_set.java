package com.example.project_one.all_getter_seetter_classes;

public class Fruits_get_set {

    int img_fruits;
    String text_fruits;

    public Fruits_get_set(int img_fruits, String text_fruits){
        this.img_fruits = img_fruits;
        this.text_fruits = text_fruits;
    }

    public int getImg_fruits(){
        return img_fruits;
    }
    public String getText_fruits(){
        return text_fruits;
    }

    public void setImg_fruits(int img_fruits){
        this.img_fruits = img_fruits;
    }
    public void setText_fruits(String text_fruits){
        this.text_fruits = text_fruits;
    }
}
