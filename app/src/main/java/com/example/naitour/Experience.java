package com.example.naitour;

/**
 * The type Experience.
 */
public class Experience {
    private int mPlaceImage;
    private String mPlaceName;
    private String mFactTittle;
    private String mFactBody;

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

    public Experience(String factTittle,String factBody){
        mFactTittle = factTittle;
        mFactBody = factBody;
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

    public String getFactTittle() {
        return mFactTittle;
    }

    public String getFactBody() {
        return mFactBody;
    }
}
