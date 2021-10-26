package com.example.englishnote;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class MyButton1 {
    public int x,y;
    public int w,h;
    public Bitmap button_img;
    private Bitmap buttonImage[] = new Bitmap[2];
    public int whichPic;

    public MyButton1(int x,int y,int z) {
        this.x = x;
        this.y = y;
        this.whichPic = z;


    }
}
