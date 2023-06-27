package com.example.project01_kggtalk.opentalk;

public class OpenSub2Recv2DTO {

    private String title,date;
    private int views;

    public OpenSub2Recv2DTO(String title, String date, int views, int imgRes) {
        this.title = title;
        this.date = date;
        this.views = views;
        this.imgRes = imgRes;
    }

    private int imgRes;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public int getViews() {
        return views;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public int getImgRes() {
        return imgRes;
    }
}
