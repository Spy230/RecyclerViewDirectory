package com.example.myapplication;

public class Books {
    private String name;
    private String bookDescription;
    private int bookResource;

    public Books(String name, String bookDescription, int bookResource) {
        this.name = name;
        this.bookDescription = bookDescription;
        this.bookResource = bookResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public int getBookResource() {
        return bookResource;
    }

    public void setBookResource(int bookResource) {
        this.bookResource = bookResource;
    }

}