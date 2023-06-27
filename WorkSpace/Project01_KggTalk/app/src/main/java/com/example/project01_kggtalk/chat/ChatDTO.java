package com.example.project01_kggtalk.chat;

import java.io.Serializable;

public class ChatDTO implements Serializable {

    private int imgRes;
    private String name,msg,date;

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getImgRes() {
        return imgRes;
    }

    public String getName() {
        return name;
    }

    public String getMsg() {
        return msg;
    }

    public String getDate() {
        return date;
    }

    public ChatDTO(int imgRes, String name, String msg, String date) {
        this.imgRes = imgRes;
        this.name = name;
        this.msg = msg;
        this.date = date;
    }
}
