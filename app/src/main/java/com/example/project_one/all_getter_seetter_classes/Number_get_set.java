package com.example.project_one.all_getter_seetter_classes;

public class Number_get_set {

        int img_num;
        String text_num;

        public Number_get_set(int img_num, String text_num){
            this.img_num = img_num;
            this.text_num = text_num;
        }

        public int getImg(){
            return img_num;
        }
        public void setImg(int img_num){
            this.img_num = img_num;
        }

        public String getText(){
            return text_num;
        }
        public  void setText(String text_num){
            this.text_num = text_num;
        }
    }

