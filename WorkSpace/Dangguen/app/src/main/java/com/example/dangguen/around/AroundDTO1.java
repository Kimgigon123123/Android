package com.example.dangguen.around;

public class AroundDTO1 {
    private int tv_rank,tv_price;
    private String tv_title, tv_address;

    public void setTv_rank(int tv_rank) {
        this.tv_rank = tv_rank;
    }

    public void setTv_price(int tv_price) {
        this.tv_price = tv_price;
    }

    public void setTv_title(String tv_title) {
        this.tv_title = tv_title;
    }

    public void setTv_address(String tv_address) {
        this.tv_address = tv_address;
    }

    public int getTv_rank() {
        return tv_rank;
    }

    public int getTv_price() {
        return tv_price;
    }

    public String getTv_title() {
        return tv_title;
    }

    public String getTv_address() {
        return tv_address;
    }

    public AroundDTO1(int tv_rank, int tv_price, String tv_title, String tv_address) {
        this.tv_rank = tv_rank;
        this.tv_price = tv_price;
        this.tv_title = tv_title;
        this.tv_address = tv_address;
    }
}
