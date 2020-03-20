package com.example.imageslider;

public class SliderItem {

    int imageGif;
    String imageUrl;
    String textDesc;

    public SliderItem() {
    }

    public SliderItem(int imageGif, String imageUrl, String textDesc) {
        this.imageGif = imageGif;
        this.imageUrl = imageUrl;
        this.textDesc = textDesc;
    }

    public int getImageGif() {
        return imageGif;
    }

    public void setImageGif(int imageGif) {
        this.imageGif = imageGif;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTextDesc() {
        return textDesc;
    }

    public void setTextDesc(String textDesc) {
        this.textDesc = textDesc;
    }
}
