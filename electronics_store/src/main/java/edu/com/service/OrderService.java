package edu.com.service;

import edu.com.model.CartItem;

import java.util.List;

public interface OrderService {
    void createOrder(String firstName, String lastName, String mobilePhone, String email, List<CartItem> cartItems);
}

