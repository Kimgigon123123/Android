package com.example.and09_fragmentadapter.menupan;

public class MenupanDTO {
    int imgRes,price;
    String name;

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImgRes() {
        return imgRes;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public MenupanDTO(int imgRes, int price, String name) {
        this.imgRes = imgRes;
        this.price = price;
        this.name = name;
    }
}
