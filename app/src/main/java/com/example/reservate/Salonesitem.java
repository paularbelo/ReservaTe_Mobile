package com.example.reservate;

public class Salonesitem
{
    private int mImageResource;
    private int mImageResource2;
    private String mText1;
    private String mText2;

    public Salonesitem(int imageResource, int imageResource2, String text1, String text2) {
        mImageResource = imageResource;
        mImageResource2= imageResource2;
        mText1 = text1;
        mText2 = text2;
    }

    public int getImageResource() {
        return mImageResource;
    }

    public int getImageResource2() {
        return mImageResource2;
    }

    public String getText1() {
        return mText1;
    }

    public String getText2() {
        return mText2;
    }
}