package com.example.project01_kggtalk.opentalk;

import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;

public class OpenSub2Recv3DTO implements Serializable {

    private String title,hashtag;
    private int imgRes,like,views;

    public OpenSub2Recv3DTO(String title, String hashtag, int imgRes, int like, int views) {
        this.title = title;
        this.hashtag = hashtag;
        this.imgRes = imgRes;
        this.like = like;
        this.views = views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getViews() {
        return views;
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


}
