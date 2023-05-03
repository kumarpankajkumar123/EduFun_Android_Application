package com.example.project_one.all_getter_seetter_classes;

public class Vegetabe_get_set {

    int img_veg;
    String text_veg;

    public Vegetabe_get_set(int img_veg , String text_veg){
        this.img_veg = img_veg;
        this.text_veg = text_veg;
    }

    public int getImg_veg(){
        return img_veg;
    }

    public void setImg_veg(int img_veg) {
        this.img_veg = img_veg;
    }

    public void setText_veg(String text_veg){
        this.text_veg = text_veg;
    }

    public String getText_veg() {
        return text_veg;
    }
}
