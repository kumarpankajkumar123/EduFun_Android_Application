package com.example.project_one.all_getter_seetter_classes;

public class Color_get_set {
    int img_color;
    String text_color;

    public Color_get_set(int img_color, String text_color){
        this.img_color = img_color;
        this.text_color = text_color;
    }

    public int getImg(){
        return img_color;
    }
    public void setImg(int img_color){
        this.img_color = img_color;
    }

    public String getText(){
        return text_color;
    }
    public  void setText(String text_color){
        this.text_color = text_color;
    }
}
