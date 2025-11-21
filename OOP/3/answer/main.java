package com.model;


public class Main {
    public static void main(String[] args) {
Order order = new Order();
order.setId(1);
order.setRequest("pizza");
        RestaurantServiceimpl restaurantServiceimpl=new Restaurant();
        restaurantServiceimpl.addorder(order);
        restaurantServiceimpl.Showorder(order);
    }
}
