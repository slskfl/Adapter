package com.example.customlistview;

public class ItemData {
    private int imgID;
    private String title;
    private String content;
    //생성자 >> 객체를 생성할 때 초기값을 부여하기 위함.
    public ItemData(int imgID, String title, String content) {
        this.imgID=imgID;
        this.title=title;
        this.content=content;
    }

    public int getImgID() {
        return imgID;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setImgID(int imgID) {
        this.imgID = imgID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
