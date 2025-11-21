package com.model.service;

public class Facebook {
    private String id,text,image;

    public Facebook(String text, String id, String image) {
        this.text = text;
        this.id = id;
        this.image = image;
    }
    public Facebook(String text, String id) {
        this.text = text;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getImage() {
        return image;
    }

    public void print() {
        System.out.println(text);
        System.out.println(id);
        if (image != null) {
            System.out.println(image);
        }
    }

}
