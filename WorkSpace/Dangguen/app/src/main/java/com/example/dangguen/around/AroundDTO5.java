package com.example.dangguen.around;

public class AroundDTO5 {

    private int imgv_main,tv_deposit,tv_price;
    private String tv_room,tv_building,tv_dong;

    public void setImgv_main(int imgv_main) {
        this.imgv_main = imgv_main;
    }

    public void setTv_deposit(int tv_deposit) {
        this.tv_deposit = tv_deposit;
    }

    public void setTv_price(int tv_price) {
        this.tv_price = tv_price;
    }

    public void setTv_room(String tv_room) {
        this.tv_room = tv_room;
    }

    public void setTv_building(String tv_building) {
        this.tv_building = tv_building;
    }

    public void setTv_dong(String tv_dong) {
        this.tv_dong = tv_dong;
    }

    public int getImgv_main() {
        return imgv_main;
    }

    public int getTv_deposit() {
        return tv_deposit;
    }

    public int getTv_price() {
        return tv_price;
    }

    public String getTv_room() {
        return tv_room;
    }

    public String getTv_building() {
        return tv_building;
    }

    public String getTv_dong() {
        return tv_dong;
    }

    public AroundDTO5(int imgv_main, int tv_deposit, int tv_price, String tv_room, String tv_building, String tv_dong) {
        this.imgv_main = imgv_main;
        this.tv_deposit = tv_deposit;
        this.tv_price = tv_price;
        this.tv_room = tv_room;
        this.tv_building = tv_building;
        this.tv_dong = tv_dong;
    }
}
