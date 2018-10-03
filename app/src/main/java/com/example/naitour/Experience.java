package com.example.naitour;

public class Experience {
    private int mPlaceImage;
    private String mPlaceName;

    public Experience(int placeImage,String placeName){
        mPlaceImage = placeImage;
        mPlaceName = placeName;
    }


    public int getPlaceImage() {
        return mPlaceImage;
    }

    public String getPlaceName() {
        return mPlaceName;
    }
}
