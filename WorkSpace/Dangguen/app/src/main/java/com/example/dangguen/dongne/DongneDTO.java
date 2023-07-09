package com.example.dangguen.dongne;

import java.io.Serializable;

public class DongneDTO implements Serializable {


    private String category,tilte,content,address,date,nickname;
    private int view,like,comment,imgRes,imgProfile,favorite;


    public DongneDTO(String category, String tilte, String content, String address, String date, int view, int like, int comment, int imgRes,int favorite,int imgProfile,String nickname) {
        this.category = category;
        this.tilte = tilte;
        this.content = content;
        this.address = address;
        this.date = date;
        this.view = view;
        this.like = like;
        this.comment = comment;
        this.imgRes = imgRes;
        this.favorite = favorite;
        this.imgProfile = imgProfile;
        this.nickname = nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setImgProfile(int imgProfile) {
        this.imgProfile = imgProfile;
    }

    public void setFavorite(int favorite) {
        this.favorite = favorite;
    }

    public String getNickname() {
        return nickname;
    }

    public int getImgProfile() {
        return imgProfile;
    }

    public int getFavorite() {
        return favorite;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setTilte(String tilte) {
        this.tilte = tilte;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setView(int view) {
        this.view = view;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public String getCategory() {
        return category;
    }

    public String getTilte() {
        return tilte;
    }

    public String getContent() {
        return content;
    }

    public String getAddress() {
        return address;
    }

    public String getDate() {
        return date;
    }

    public int getView() {
        return view;
    }

    public int getLike() {
        return like;
    }

    public int getComment() {
        return comment;
    }

    public int getImgRes() {
        return imgRes;
    }
}
