package com.example.dangguen.home;

import java.io.Serializable;

public class HomeDTO implements Serializable {

    private int imgRes,price,comment,favorite,profileImg,views;
    private String title,address,date,name,content;

    boolean isLike =  false;

    public void setProfileImg(int profileImg) {
        this.profileImg = profileImg;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getProfileImg() {
        return profileImg;
    }

    public int getViews() {
        return views;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }

    public void setFavorite(int favorite) {
        this.favorite = favorite;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getImgRes() {
        return imgRes;
    }

    public int getPrice() {
        return price;
    }

    public int getComment() {
        return comment;
    }

    public int getFavorite() {
        return favorite;
    }

    public String getTitle() {
        return title;
    }

    public String getAddress() {
        return address;
    }

    public String getDate() {
        return date;
    }

    public HomeDTO(int imgRes, int price, int comment, int favorite, String title, String address, String date, int profileImg,int views,String name, String content) {
        this.imgRes = imgRes;
        this.price = price;
        this.comment = comment;
        this.favorite = favorite;
        this.title = title;
        this.address = address;
        this.date = date;
        this.profileImg=profileImg;
        this.views=views;
        this.name=name;
        this.content=content;
    }
}
