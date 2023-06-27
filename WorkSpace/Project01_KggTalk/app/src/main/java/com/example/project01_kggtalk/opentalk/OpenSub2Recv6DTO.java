package com.example.project01_kggtalk.opentalk;

public class OpenSub2Recv6DTO {

    private String title;
    private int imgRes;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public String getTitle() {
        return title;
    }

    public int getImgRes() {
        return imgRes;
    }

    public OpenSub2Recv6DTO(String title, int imgRes) {
        this.title = title;
        this.imgRes = imgRes;
    }
}
