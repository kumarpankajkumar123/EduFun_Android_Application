package com.example.project_one.all_getter_seetter_classes;

public class Flower_get_set {

    int img_flo;
    String text_flo;

    public Flower_get_set(int img_flo,String text_flo){
        this.img_flo = img_flo;
        this.text_flo = text_flo;
    }

    public void setImg_flo(int img_flo) {
        this.img_flo = img_flo;
    }

    public int getImg_flo() {
        return img_flo;
    }

    public void setText_flo(String text_flo) {
        this.text_flo = text_flo;
    }
    public String getText_flo(){
        return text_flo;
    }
}
