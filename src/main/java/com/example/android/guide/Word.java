package com.example.android.guide;

public class Word {
    private String location;
    private String businessHour;
    private String phoneNuber;
    private int imageId = NO_IMAGE;
    private static final int NO_IMAGE = -1;


    public Word(String location, String businessHour, String phoneNuber) {
        this.location = location;
        this.businessHour = businessHour;
        this.phoneNuber = phoneNuber;
    }


    public Word(String location, String businessHour, String phoneNuber, int imageId) {
        this.location = location;
        this.businessHour = businessHour;
        this.phoneNuber = phoneNuber;
        this.imageId = imageId;
    }


    public Word(String location, int imageId) {
        this.location = location;
        this.imageId = imageId;
    }


    public String getLocation() {
        return location;
    }

    public String getBusinessHour() {
        return businessHour;
    }

    public String getPhoneNuber() {
        return phoneNuber;
    }

    public int getImageId() {
        return imageId;
    }

    public boolean hasImage() {
        return imageId != NO_IMAGE;
    }
}
