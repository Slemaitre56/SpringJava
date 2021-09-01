package com.mbc.photos.shop.domain;

public class User {

    private int userId;
    private String userName;
    private String userPassword;
    private String userHat;

    public User(int userId, String userName, String userPassword, String userHat) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userHat = userHat;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserHat() {
        return userHat;
    }

    public void setUserHat(String userHat) {
        this.userHat = userHat;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userHat='" + userHat + '\'' +
                '}';
    }
}
