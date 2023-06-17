package com.example.and07_activityintent;

public class DrinkDTO {

    String name;
    int price,cnt;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCnt() {
        return cnt;
    }

    public DrinkDTO(String name, int price, int cnt) {
        this.name = name;
        this.price = price;
        this.cnt = cnt;
    }
}
