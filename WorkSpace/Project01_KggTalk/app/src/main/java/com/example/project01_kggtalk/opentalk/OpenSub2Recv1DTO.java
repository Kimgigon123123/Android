package com.example.project01_kggtalk.opentalk;

import java.io.Serializable;

public class OpenSub2Recv1DTO implements Serializable {

    private String title;
    private int views,imgRes;

    public OpenSub2Recv1DTO(String title, int views, int imgRes) {
        this.title = title;
        this.views = views;
        this.imgRes = imgRes;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public String getTitle() {
        return title;
    }

    public int getViews() {
        return views;
    }

    public OpenSub2Recv1DTO(String title, int views) {
        this.title = title;
        this.views = views;
    }
}
