package com.example.and09_fragmentadapter.practice;

public class PracticeDTO {
    int imgRes,rank;
    String title,singer;

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getImgRes() {
        return imgRes;
    }

    public int getRank() {
        return rank;
    }

    public String getTitle() {
        return title;
    }

    public String getSinger() {
        return singer;
    }

    public PracticeDTO(int imgRes, int rank, String title, String singer) {
        this.imgRes = imgRes;
        this.rank = rank;
        this.title = title;
        this.singer = singer;
    }
}
