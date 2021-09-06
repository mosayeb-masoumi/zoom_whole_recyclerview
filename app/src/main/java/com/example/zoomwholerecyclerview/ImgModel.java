package com.example.zoomwholerecyclerview;

import android.graphics.Bitmap;

public class ImgModel {

    String url;
    Bitmap bitmap;

    public ImgModel(String url, Bitmap bitmap) {
        this.url = url;
        this.bitmap = bitmap;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }



}
