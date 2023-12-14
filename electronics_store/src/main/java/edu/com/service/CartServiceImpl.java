package edu.com.service;

import edu.com.model.CartItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CartServiceImpl implements CartService {
    private List<CartItem> cartItems = new ArrayList<>();

    @Override
    public void addToCart(Long productId, String name, double price) {
        Optional<CartItem> existingItem = cartItems.stream()
                .filter(item -> item.getId().equals(productId))
                .findFirst();

        if (existingItem.isPresent()) {
            existingItem.get().incrementQuantity();
        } else {
            CartItem newItem = new CartItem(productId, name, price);
            cartItems.add(newItem);
        }
    }

    @Override
    public void removeFromCart(Long productId) {
        cartItems.removeIf(item -> item.getId().equals(productId));
    }

    @Override
    public List<CartItem> getCartItems() {
        return new ArrayList<>(cartItems);
    }

    @Override
    public void clearCart() {
        cartItems.clear();
    }
    @Override
    public void changeQuantity(Long productId, int value) {
        Optional<CartItem> existingItem = cartItems.stream()
                .filter(item -> item.getId().equals(productId))
                .findFirst();
        if (value == 1) {
            existingItem.get().incrementQuantity();
        } else {
            existingItem.get().decrementQuantity();
        }

        if (existingItem.get().getQuantity() == 0) removeFromCart(productId);
    }
}
