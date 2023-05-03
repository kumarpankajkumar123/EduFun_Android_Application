package com.example.project_one.all_getter_seetter_classes;

public class Bird_get_set {

    int img_bird;
    String text_bird;

    public Bird_get_set(int img_bird , String text_bird){
        this.img_bird = img_bird;
        this.text_bird = text_bird;
    }

    public void setImg_bird(int img_bird) {
        this.img_bird = img_bird;
    }

    public void setText_bird(String text_bird) {
        this.text_bird = text_bird;
    }

    public int getImg_bird() {
        return img_bird;
    }

    public String getText_bird() {
        return text_bird;
    }
}
