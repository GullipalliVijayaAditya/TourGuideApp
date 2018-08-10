package com.example.aditya.tourguideapp;

import android.content.Context;
import android.content.res.TypedArray;

import java.util.ArrayList;


public class Attraction {
    private String attrName;
    private String attrCategory;
    private String attrAddress;
    private String attrCoordinates;
    private String attrPhoneNumberText;
    private String attrPhoneNumberLink;
    private String attrWebsite;
    private String attrDescription;
    private String attrBlurb;
    private int attrImageId;
    private boolean isFavorite;

    public Attraction() {
    }

    public Attraction(String name, String category, String address, String coordinates, String phone, String phoneLink, String website, String description, String blurb, int imageId) {
        attrName = name;
        attrCategory = category;
        attrAddress = address;
        attrCoordinates = coordinates;
        attrPhoneNumberText = phone;
        attrPhoneNumberLink = phoneLink;
        attrWebsite = website;
        attrDescription = description;
        attrBlurb = blurb;
        attrImageId = imageId;
    }

    public String getAttractionName() {
        return attrName;
    }

    public void setAttractionName(String newAttractionName) {
        attrName = newAttractionName;
    }

    public String getAttractionCategory() {
        return attrCategory;
    }

    public void setAttractionCategory(String newAttractionCategory) {
        attrCategory = newAttractionCategory;
    }

    public String getAttractionAddress() {
        return attrAddress;
    }

    public void setAttractionAddress(String newAttractionAddress) {
        attrAddress = newAttractionAddress;
    }

    public String getAttractionCoordinates() {
        return attrCoordinates;
    }

    public void setAttractionCoordinates(String newAttractionCoordinates) {
        attrCoordinates = newAttractionCoordinates;
    }

    public String getAttractionPhoneNumberText() {
        return attrPhoneNumberText;
    }

    public void setAttractionPhoneNumberText(String newAttractionPhoneNumberText) {
        attrPhoneNumberText = newAttractionPhoneNumberText;
    }

    public String getAttractionPhoneNumberLink() {
        return attrPhoneNumberLink;
    }

    public void setAttractionPhoneNumberLink(String newAttractionPhoneNumberLink) {
        attrPhoneNumberLink = newAttractionPhoneNumberLink;
    }

    public String getAttractionWebsite() {
        return attrWebsite;
    }

    public void setAttractionWebsite(String newAttractionWebsite) {
        attrWebsite = newAttractionWebsite;
    }

    public String getAttractionDescription() {
        return attrDescription;
    }

    public void setAttractionDescription(String newAttractionDescription) {
        attrDescription = newAttractionDescription;
    }

    public String getAttractionBlurb() {
        return attrBlurb;
    }

    public void setAttractionBlurb(String newAttractionBlurb) {
        attrBlurb = newAttractionBlurb;
    }

    public int getAttractionImageId() {
        return attrImageId;
    }

    public void setAttractionImageId(int newAttractionImageId) {
        attrImageId = newAttractionImageId;
    }

    public ArrayList<Attraction> getFullListArray(Context context) {
        final ArrayList<Attraction> fullListArray = new ArrayList<>();
        String names[] = context.getResources().getStringArray(R.array.attr_name);
        String categories[] = context.getResources().getStringArray(R.array.attr_category);
        String addresses[] = context.getResources().getStringArray(R.array.attr_address);
        String coordinates[] = context.getResources().getStringArray(R.array.attr_coordinates);
        String phones[] = context.getResources().getStringArray(R.array.attr_phone);
        String phoneLinks[] = context.getResources().getStringArray(R.array.attr_phone_link);
        String website[] = context.getResources().getStringArray(R.array.attr_website);
        String descriptions[] = context.getResources().getStringArray(R.array.attr_description);
        String blurbs[] = context.getResources().getStringArray(R.array.attr_blurb);
        TypedArray attrImages = context.getResources().obtainTypedArray(R.array.attr_images);
        for (int i = 0; i < names.length; i++) {
            fullListArray.add(new Attraction(names[i], categories[i], addresses[i], coordinates[i], phones[i], phoneLinks[i], website[i], descriptions[i], blurbs[i], attrImages.getResourceId(i, -1)));
        }
        attrImages.recycle();
        return fullListArray;
    }

    public ArrayList<Attraction> getDiningArray(Context context) {
        final ArrayList<Attraction> diningArray = new ArrayList<>();
        String names[] = context.getResources().getStringArray(R.array.attr_name);
        String categories[] = context.getResources().getStringArray(R.array.attr_category);
        String addresses[] = context.getResources().getStringArray(R.array.attr_address);
        String coordinates[] = context.getResources().getStringArray(R.array.attr_coordinates);
        String phones[] = context.getResources().getStringArray(R.array.attr_phone);
        String phoneLinks[] = context.getResources().getStringArray(R.array.attr_phone_link);
        String website[] = context.getResources().getStringArray(R.array.attr_website);
        String descriptions[] = context.getResources().getStringArray(R.array.attr_description);
        String blurbs[] = context.getResources().getStringArray(R.array.attr_blurb);
        TypedArray attrImages = context.getResources().obtainTypedArray(R.array.attr_images);
        for (int i = 0; i < 4; i++) {
            diningArray.add(new Attraction(names[i], categories[i], addresses[i], coordinates[i], phones[i], phoneLinks[i], website[i], descriptions[i], blurbs[i], attrImages.getResourceId(i, -1)));
        }
        attrImages.recycle();
        return diningArray;
    }

    public ArrayList<Attraction> getShoppingArray(Context context) {
        final ArrayList<Attraction> shoppingArray = new ArrayList<>();
        String names[] = context.getResources().getStringArray(R.array.attr_name);
        String categories[] = context.getResources().getStringArray(R.array.attr_category);
        String addresses[] = context.getResources().getStringArray(R.array.attr_address);
        String coordinates[] = context.getResources().getStringArray(R.array.attr_coordinates);
        String phones[] = context.getResources().getStringArray(R.array.attr_phone);
        String phoneLinks[] = context.getResources().getStringArray(R.array.attr_phone_link);
        String website[] = context.getResources().getStringArray(R.array.attr_website);
        String descriptions[] = context.getResources().getStringArray(R.array.attr_description);
        String blurbs[] = context.getResources().getStringArray(R.array.attr_blurb);
        TypedArray attrImages = context.getResources().obtainTypedArray(R.array.attr_images);
        for (int i = 9; i < 12; i++) {
            shoppingArray.add(new Attraction(names[i], categories[i], addresses[i], coordinates[i], phones[i], phoneLinks[i], website[i], descriptions[i], blurbs[i], attrImages.getResourceId(i, -1)));
        }
        attrImages.recycle();
        return shoppingArray;
    }

    public ArrayList<Attraction> getVenuesArray(Context context) {
        final ArrayList<Attraction> venuesArray = new ArrayList<>();
        String names[] = context.getResources().getStringArray(R.array.attr_name);
        String categories[] = context.getResources().getStringArray(R.array.attr_category);
        String addresses[] = context.getResources().getStringArray(R.array.attr_address);
        String coordinates[] = context.getResources().getStringArray(R.array.attr_coordinates);
        String phones[] = context.getResources().getStringArray(R.array.attr_phone);
        String phoneLinks[] = context.getResources().getStringArray(R.array.attr_phone_link);
        String website[] = context.getResources().getStringArray(R.array.attr_website);
        String descriptions[] = context.getResources().getStringArray(R.array.attr_description);
        String blurbs[] = context.getResources().getStringArray(R.array.attr_blurb);
        TypedArray attrImages = context.getResources().obtainTypedArray(R.array.attr_images);
        for (int i = 12; i < 16; i++) {
            venuesArray.add(new Attraction(names[i], categories[i], addresses[i], coordinates[i], phones[i], phoneLinks[i], website[i], descriptions[i], blurbs[i], attrImages.getResourceId(i, -1)));
        }
        attrImages.recycle();
        return venuesArray;
    }

    public ArrayList<Attraction> getNightlifeArray(Context context) {
        final ArrayList<Attraction> nightlifeArray = new ArrayList<>();
        String names[] = context.getResources().getStringArray(R.array.attr_name);
        String categories[] = context.getResources().getStringArray(R.array.attr_category);
        String addresses[] = context.getResources().getStringArray(R.array.attr_address);
        String coordinates[] = context.getResources().getStringArray(R.array.attr_coordinates);
        String phones[] = context.getResources().getStringArray(R.array.attr_phone);
        String phoneLinks[] = context.getResources().getStringArray(R.array.attr_phone_link);
        String website[] = context.getResources().getStringArray(R.array.attr_website);
        String descriptions[] = context.getResources().getStringArray(R.array.attr_description);
        String blurbs[] = context.getResources().getStringArray(R.array.attr_blurb);

        TypedArray attrImages = context.getResources().obtainTypedArray(R.array.attr_images);

        for (int i = 4; i < 9; i++) {
            nightlifeArray.add(new Attraction(names[i], categories[i], addresses[i], coordinates[i], phones[i], phoneLinks[i], website[i], descriptions[i], blurbs[i], attrImages.getResourceId(i, -1)));
        }
        attrImages.recycle();
        return nightlifeArray;
    }

    public Attraction getHomePageAttraction(Context context, int i) {
        String names[] = context.getResources().getStringArray(R.array.attr_name);
        String categories[] = context.getResources().getStringArray(R.array.attr_category);
        String addresses[] = context.getResources().getStringArray(R.array.attr_address);
        String coordinates[] = context.getResources().getStringArray(R.array.attr_coordinates);
        String phones[] = context.getResources().getStringArray(R.array.attr_phone);
        String phoneLinks[] = context.getResources().getStringArray(R.array.attr_phone_link);
        String website[] = context.getResources().getStringArray(R.array.attr_website);
        String descriptions[] = context.getResources().getStringArray(R.array.attr_description);
        String blurbs[] = context.getResources().getStringArray(R.array.attr_blurb);
        TypedArray attrImages = context.getResources().obtainTypedArray(R.array.attr_images);
        final Attraction homePageAttraction = new Attraction(names[i], categories[i], addresses[i], coordinates[i], phones[i], phoneLinks[i], website[i], descriptions[i], blurbs[i], attrImages.getResourceId(i, -1));
        attrImages.recycle();
        return homePageAttraction;
    }

    public Attraction getDiningAttraction(Context context, int i) {
        return new Attraction().getDiningArray(context).get(i);
    }

    public Attraction getShoppingAttraction(Context context, int i) {
        return new Attraction().getShoppingArray(context).get(i);
    }

    public Attraction getVenuesAttraction(Context context, int i) {
        return new Attraction().getVenuesArray(context).get(i);
    }

    public Attraction getNightlifeAttraction(Context context, int i) {
        return new Attraction().getNightlifeArray(context).get(i);
    }

    public Attraction getDetailAttraction(Context context, int category, int index) {
        if (category == 0) {
            return getHomePageAttraction(context, index);
        } else if (category == 1) {
            return getDiningAttraction(context, index);
        } else if (category == 2) {
            return getShoppingAttraction(context, index);
        } else if (category == 3) {
            return getVenuesAttraction(context, index);
        } else {
            return getNightlifeAttraction(context, index);
        }
    }

    @Override
    public String toString() {
        return "Attraction name is " + attrName + "\nAttraction Category is " + attrCategory + "\nAttraction Address is " + attrAddress + "\nAttraction Number is " + attrPhoneNumberText + "\nAttraction Website is " + attrWebsite + "\nAttraction Blurb is " + attrBlurb + "\nAttraction Description is " + attrDescription;
    }
}