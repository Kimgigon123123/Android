package com.example.dangguen.around;

public class AroundDTO8 {

    private int imgRes,tv_price,tv_saving;
    private String tv_brand,tv_name;

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public void setTv_price(int tv_price) {
        this.tv_price = tv_price;
    }

    public void setTv_saving(int tv_saving) {
        this.tv_saving = tv_saving;
    }

    public void setTv_brand(String tv_brand) {
        this.tv_brand = tv_brand;
    }

    public void setTv_name(String tv_name) {
        this.tv_name = tv_name;
    }

    public int getImgRes() {
        return imgRes;
    }

    public int getTv_price() {
        return tv_price;
    }

    public int getTv_saving() {
        return tv_saving;
    }

    public String getTv_brand() {
        return tv_brand;
    }

    public String getTv_name() {
        return tv_name;
    }

    public AroundDTO8(int imgRes, int tv_price, int tv_saving, String tv_brand, String tv_name) {
        this.imgRes = imgRes;
        this.tv_price = tv_price;
        this.tv_saving = tv_saving;
        this.tv_brand = tv_brand;
        this.tv_name = tv_name;
    }
}
