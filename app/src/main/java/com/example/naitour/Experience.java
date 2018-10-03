package com.example.naitour;

/**
 * The type Experience.
 */
public class Experience {
    private int mPlaceImage;
    private String mPlaceName;

    /**
     * Instantiates a new Experience.
     *
     * @param placeImage the place image
     * @param placeName  the place name
     */
    public Experience(int placeImage,String placeName){
        mPlaceImage = placeImage;
        mPlaceName = placeName;
    }


    /**
     * Gets place image.
     *
     * @return the place image
     */
    public int getPlaceImage() {
        return mPlaceImage;
    }

    /**
     * Gets place name.
     *
     * @return the place name
     */
    public String getPlaceName() {
        return mPlaceName;
    }
}
