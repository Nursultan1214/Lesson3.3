package com.example.lesson33;

public class Model {

    private int id;
    private int image;
    private String counter;

    public Model(int id, String counter) {
        this.id = id;
        this.counter = counter;
    }

    public Model(int id, int image, String counter) {
        this.id = id;
        this.image = image;
        this.counter = counter;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getCounter() {
        return counter;
    }

    public void setCounter(String counter) {
        this.counter = counter;
    }
}
