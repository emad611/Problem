package com.model;

public class Restaurant extends RestaurantServiceimpl {
    @Override
    public  void Showorder(Order order){
        System.out.println("Show order");
        System.out.println("id: "+order.getId());
        System.out.println("request: "+order.getRequest());
    }
    @Override
    public Order addorder(Order order) {
        System.out.println("order added");
        return order;
    }
}
