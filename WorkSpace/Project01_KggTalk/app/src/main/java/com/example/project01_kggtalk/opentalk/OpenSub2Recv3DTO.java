package com.example.project01_kggtalk.opentalk;

import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;

public class OpenSub2Recv3DTO implements Serializable {

    private String title,hashtag;
    private int imgRes,like;



    public OpenSub2Recv3DTO(String title, int imgRes) {
        this.title = title;
        this.imgRes = imgRes;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setHashtag(String hashtag) {
        this.hashtag = hashtag;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public String getTitle() {
        return title;
    }

    public String getHashtag() {
        return hashtag;
    }

    public int getImgRes() {
        return imgRes;
    }

    public int getLike() {
        return like;
    }

    public OpenSub2Recv3DTO(String title, String hashtag, int imgRes, int like) {
        this.title = title;
        this.hashtag = hashtag;
        this.imgRes = imgRes;
        this.like = like;
    }
}
