package com.example.tourguide;

public class Word {

    /**
     * String resource ID for mTitleId
     */
    private int mTitleId;
    /**
     * String resource ID for mLocationId
     */
    private int mLocationId;
    /**
     * Image resource ID for mResouceImageId
     */
    private int mResouceImageId;

    /**
     * Create a new Word object
     *
     * @param TitleId
     * @param LocationId
     * @param ResouceImageId
     */
    public Word(int TitleId, int LocationId, int ResouceImageId) {
        mTitleId = TitleId;
        mLocationId = LocationId;
        mResouceImageId = ResouceImageId;
    }

    /**
     * Get the string resource ID for title.
     */
    public int getTitleId() {
        return mTitleId;
    }

    /**
     * Get the string resource ID for Location.
     */
    public int getLocationId() {
        return mLocationId;
    }

    /**
     * Get the string resource ID for Image.
     */
    public int getResourceImageId() {
        return mResouceImageId;
    }
}
