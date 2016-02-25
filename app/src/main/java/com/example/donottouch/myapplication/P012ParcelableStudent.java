package com.example.donottouch.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class P012ParcelableStudent implements Parcelable{

    String studentName;
    String studentSurname;
    int studentAge;

    public P012ParcelableStudent(String studentName, String studentSurname, int studentAge) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.studentAge = studentAge;
    }

    @Override
    public int describeContents() {
        return 0;
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(studentName);
        dest.writeString(studentSurname);
        dest.writeInt(studentAge);
    }
    protected P012ParcelableStudent(Parcel in) {
        studentName= in.readString();
        studentSurname= in.readString();
        studentAge= in.readInt();
    }

    public static final Creator<P012ParcelableStudent> CREATOR = new Creator<P012ParcelableStudent>() {
        @Override
        public P012ParcelableStudent createFromParcel(Parcel in) {
            return new P012ParcelableStudent(in);
        }

        @Override
        public P012ParcelableStudent[] newArray(int size) {
            return new P012ParcelableStudent[size];
        }
    };
}