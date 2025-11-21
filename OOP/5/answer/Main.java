package com.model;


import com.model.service.BaseEntity;
import com.model.service.Player;
import com.model.service.Shrit;
// relationship
public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.setId(1);
        player.setName("emad");
        Shrit shrit = new Shrit();
        shrit.setId(11);
        shrit.setColor("blue");
        shrit.setNumber(7);

        player.setShrit(shrit);
        shrit.setPlayer(player);
        // .getShrit() --> يعنى اعطينى كل السمات الى موجودة فى الكلاس دا
        System.out.println(player.getShrit().getNumber());
        // .getPlayer() --> يعنى اعطينى كل السمات الى موجودة فى الكلاس دا
        System.out.println(shrit.getPlayer().getName());
    }
}
