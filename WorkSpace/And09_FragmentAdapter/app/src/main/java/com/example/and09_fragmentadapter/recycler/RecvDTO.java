package com.example.and09_fragmentadapter.recycler;

public class RecvDTO {
    int ImgRes,age;
    String name,gender,address;

    public void setImgRes(int imgRes) {
        ImgRes = imgRes;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getImgRes() {
        return ImgRes;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public RecvDTO(int imgRes, int age, String name, String gender, String address) {
        ImgRes = imgRes;
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.address = address;
    }
}
