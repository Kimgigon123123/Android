package com.example.dangguen.dongne;

import java.io.Serializable;

public class DongneDTO implements Serializable {


    private String category,tilte,content,address,date;
    private int view,like,comment,imgRes;


    public DongneDTO(String category, String tilte, String content, String address, String date, int view, int like, int comment, int imgRes) {
        this.category = category;
        this.tilte = tilte;
        this.content = content;
        this.address = address;
        this.date = date;
        this.view = view;
        this.like = like;
        this.comment = comment;
        this.imgRes = imgRes;
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
