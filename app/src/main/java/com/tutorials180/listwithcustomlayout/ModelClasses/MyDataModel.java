package com.tutorials180.listwithcustomlayout.ModelClasses;

public class MyDataModel {

    private String userName;
    private String userPhoneNumber;

    private int imageResourceValue;

    public MyDataModel(String userName, String userPhoneNumber, int imageResourceValue) {
        this.userName = userName;
        this.userPhoneNumber = userPhoneNumber;
        this.imageResourceValue = imageResourceValue;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public int getImageResourceValue() {
        return imageResourceValue;
    }

    public void setImageResourceValue(int imageResourceValue) {
        this.imageResourceValue = imageResourceValue;
    }
}
