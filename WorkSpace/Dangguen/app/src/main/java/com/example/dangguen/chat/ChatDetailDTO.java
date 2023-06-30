package com.example.dangguen.chat;

public class ChatDetailDTO {

    private int imgv_profile,imgv_main;
    private String tv_date,tv_time,btn_button,tv_content;

    public void setImgv_profile(int imgv_profile) {
        this.imgv_profile = imgv_profile;
    }

    public void setImgv_main(int imgv_main) {
        this.imgv_main = imgv_main;
    }

    public void setTv_date(String tv_date) {
        this.tv_date = tv_date;
    }

    public void setTv_time(String tv_time) {
        this.tv_time = tv_time;
    }

    public void setBtn_button(String btn_button) {
        this.btn_button = btn_button;
    }

    public void setTv_content(String tv_content) {
        this.tv_content = tv_content;
    }

    public int getImgv_profile() {
        return imgv_profile;
    }

    public int getImgv_main() {
        return imgv_main;
    }

    public String getTv_date() {
        return tv_date;
    }

    public String getTv_time() {
        return tv_time;
    }

    public String getBtn_button() {
        return btn_button;
    }

    public String getTv_content() {
        return tv_content;
    }

    public ChatDetailDTO(int imgv_profile, int imgv_main, String tv_date, String tv_time, String btn_button, String tv_content) {
        this.imgv_profile = imgv_profile;
        this.imgv_main = imgv_main;
        this.tv_date = tv_date;
        this.tv_time = tv_time;
        this.btn_button = btn_button;
        this.tv_content = tv_content;
    }
}
