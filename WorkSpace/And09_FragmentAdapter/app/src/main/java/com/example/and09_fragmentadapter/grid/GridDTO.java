package com.example.and09_fragmentadapter.grid;

public class GridDTO {

    int imgRes;
    String  name;

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImgRes() {
        return imgRes;
    }

    public String getName() {
        return name;
    }

    public GridDTO(int imgRes, String name) {
        this.imgRes = imgRes;
        this.name = name;
    }
}
