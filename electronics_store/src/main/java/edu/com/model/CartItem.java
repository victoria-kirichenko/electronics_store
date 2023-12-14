package edu.com.model;

public class CartItem {
    private Long id;
    private String name;
    private double price;
    private int quantity;
    private double totalPrice;

    public CartItem(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = 1;
        this.totalPrice = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void incrementQuantity() {
        this.quantity += 1;
        this.totalPrice += price;
    }

    public void decrementQuantity() {
        this.quantity -= 1;
        this.totalPrice -= price;
    }

}

