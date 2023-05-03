package com.example.project_one.all_getter_seetter_classes;

public class Animal_get_set {
    int img_animal;
    String text_animal;

    public Animal_get_set(int img_animal,String text_animal){
        this.img_animal = img_animal;
        this.text_animal = text_animal;
    }

    public int getImg_animal() {
        return img_animal;
    }

    public String getText_animal() {
        return text_animal;
    }

    public void setImg_animal(int img_animal) {
        this.img_animal = img_animal;
    }

    public void setText_animal(String text_animal) {
        this.text_animal = text_animal;
    }
}
