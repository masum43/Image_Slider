package com.example.imageslider;

public class SliderItem {

    String imageUrl;
    String textDesc;

    public SliderItem() {
    }

    public SliderItem( String imageUrl, String textDesc) {

        this.imageUrl = imageUrl;
        this.textDesc = textDesc;
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
