package edu.com.service;

import edu.com.model.CartItem;
import java.util.List;
public interface CartService {
    void addToCart(Long productId, String name, double price);
    void removeFromCart(Long productId);
    List<CartItem> getCartItems();
    void clearCart();
    void changeQuantity(Long productId, int value);
}

