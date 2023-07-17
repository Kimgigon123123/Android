package com.example.dangguen.around;

public class AroundDTO4Rcv4 {

    private int imgRes,tv_price,tv_distance,tv_date;
    private String tv_name,tv_dong,tv_content;

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public void setTv_price(int tv_price) {
        this.tv_price = tv_price;
    }

    public void setTv_distance(int tv_distance) {
        this.tv_distance = tv_distance;
    }

    public void setTv_date(int tv_date) {
        this.tv_date = tv_date;
    }

    public void setTv_name(String tv_name) {
        this.tv_name = tv_name;
    }

    public void setTv_dong(String tv_dong) {
        this.tv_dong = tv_dong;
    }

    public void setTv_content(String tv_content) {
        this.tv_content = tv_content;
    }

    public int getImgRes() {
        return imgRes;
    }

    public int getTv_price() {
        return tv_price;
    }

    public int getTv_distance() {
        return tv_distance;
    }

    public int getTv_date() {
        return tv_date;
    }

    public String getTv_name() {
        return tv_name;
    }

    public String getTv_dong() {
        return tv_dong;
    }

    public String getTv_content() {
        return tv_content;
    }

    public AroundDTO4Rcv4(int imgRes, int tv_price, int tv_distance, int tv_date, String tv_name, String tv_dong, String tv_content) {
        this.imgRes = imgRes;
        this.tv_price = tv_price;
        this.tv_distance = tv_distance;
        this.tv_date = tv_date;
        this.tv_name = tv_name;
        this.tv_dong = tv_dong;
        this.tv_content = tv_content;
    }
}
