package com.example.dangguen.around;

public class AroundDTO2 {

    private int imgv_main,imgv_profile;
    private String tv_profile_name,tv_address,tv_title,tv_date;

    public void setImgv_main(int imgv_main) {
        this.imgv_main = imgv_main;
    }

    public void setImgv_profile(int imgv_profile) {
        this.imgv_profile = imgv_profile;
    }

    public void setTv_profile_name(String tv_profile_name) {
        this.tv_profile_name = tv_profile_name;
    }

    public void setTv_address(String tv_address) {
        this.tv_address = tv_address;
    }



    public void setTv_date(String tv_date) {
        this.tv_date = tv_date;
    }



    public int getImgv_main() {
        return imgv_main;
    }

    public int getImgv_profile() {
        return imgv_profile;
    }

    public String getTv_profile_name() {
        return tv_profile_name;
    }

    public String getTv_address() {
        return tv_address;
    }



    public String getTv_date() {
        return tv_date;
    }



    public void setTv_title(String tv_title) {
        this.tv_title = tv_title;
    }

    public String getTv_title() {
        return tv_title;
    }

    public AroundDTO2(int imgv_main, int imgv_profile, String tv_profile_name, String tv_address, String tv_title, String tv_date) {
        this.imgv_main = imgv_main;
        this.imgv_profile = imgv_profile;
        this.tv_profile_name = tv_profile_name;
        this.tv_address = tv_address;
        this.tv_title = tv_title;
        this.tv_date = tv_date;

    }
}
