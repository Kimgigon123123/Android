package com.example.dangguen.around;

public class AroundDTO3 {

    private int imgv_main,tv_price,tv_views;
    private String tv_brand,tv_name;

    public void setImgv_main(int imgv_main) {
        this.imgv_main = imgv_main;
    }

    public void setTv_price(int tv_price) {
        this.tv_price = tv_price;
    }

    public void setTv_views(int tv_views) {
        this.tv_views = tv_views;
    }

    public void setTv_brand(String tv_brand) {
        this.tv_brand = tv_brand;
    }

    public void setTv_name(String tv_name) {
        this.tv_name = tv_name;
    }

    public int getImgv_main() {
        return imgv_main;
    }

    public int getTv_price() {
        return tv_price;
    }

    public int getTv_views() {
        return tv_views;
    }

    public String getTv_brand() {
        return tv_brand;
    }

    public String getTv_name() {
        return tv_name;
    }

    public AroundDTO3(int imgv_main, int tv_price, int tv_views, String tv_brand, String tv_name) {
        this.imgv_main = imgv_main;
        this.tv_price = tv_price;
        this.tv_views = tv_views;
        this.tv_brand = tv_brand;
        this.tv_name = tv_name;
    }
}
