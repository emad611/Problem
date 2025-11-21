package com.model;

public abstract class RestaurantServiceimpl implements RestaurantService {
    public Order addorder(Order order) {
        return order;
    }
    public abstract void Showorder(Order order);
}
