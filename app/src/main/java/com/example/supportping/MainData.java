package com.example.supportping;

public class MainData {

    // 게시물 관련
    String title;
    String nickname;
    String place;
    String personnel;
    String price;


    public MainData(String title, String nickname, String place, String personnel, String price) {
        this.title = title;
        this.nickname = nickname;
        this.place = place;
        this.personnel = personnel;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPlace() {
        return place;
    }

    public String getPersonnel() {
        return personnel;
    }

    public String getPrice() {
        return price;
    }
}