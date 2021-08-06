package com.example.homeworkfive;

import android.os.Parcel;
import android.os.Parcelable;

public class DisplayText implements Parcelable {

    private String text = "";

    protected DisplayText(Parcel in) {
        text = in.readString();
    }

    public static final Creator<DisplayText> CREATOR = new Creator<DisplayText>() {
        @Override
        public DisplayText createFromParcel(Parcel in) {
            return new DisplayText(in);
        }

        @Override
        public DisplayText[] newArray(int size) {
            return new DisplayText[size];
        }
    };

    public DisplayText() {

    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(text);
    }
}
