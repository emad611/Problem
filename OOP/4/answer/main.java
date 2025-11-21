package com.model;


import com.model.service.Facebook;

public class Main {
    public static void main(String[] args) {
        Facebook facebook=new Facebook("Facebook ID","Facebook Token");
        Facebook facebook1=new Facebook("Facebook ID","Facebook Token","jpj");
        facebook.print();
        System.out.println("-------");
        System.out.println("Facebook ID: "+facebook1.getImage());
        System.out.println("----------");
        facebook1.print();
    }
}
