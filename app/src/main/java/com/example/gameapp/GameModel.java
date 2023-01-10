package com.example.gameapp;

public class GameModel {
    private int imgGameResource;
    private String name;

    public int getImgGameResource() {
        return imgGameResource;
    }

    public void setImgGameResource(int imgGameResource) {
        this.imgGameResource = imgGameResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GameModel(String name, int imgGameResource) {
        this.imgGameResource = imgGameResource;
        this.name = name;
    }
}
