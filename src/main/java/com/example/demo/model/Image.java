package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Image {
    @Id
    @Column
    private int id;

    @Column
    private String imgName;

    @Column
     private String userName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUseId(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", imgName='" + imgName + '\'' +
                ", useId='" + userName + '\'' +
                '}';
    }
}
