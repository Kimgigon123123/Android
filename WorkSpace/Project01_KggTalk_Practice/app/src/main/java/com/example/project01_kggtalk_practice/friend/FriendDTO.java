package com.example.project01_kggtalk_practice.friend;

public class FriendDTO {

    private int resImgId;
    private String name,msg;

    public FriendDTO(int resImgId, String name, String msg) {
        this.resImgId = resImgId;
        this.name = name;
        this.msg = msg;
    }

    public void setResImgId(int resImgId) {
        this.resImgId = resImgId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getResImgId() {
        return resImgId;
    }

    public String getName() {
        return name;
    }

    public String getMsg() {
        return msg;
    }
}
