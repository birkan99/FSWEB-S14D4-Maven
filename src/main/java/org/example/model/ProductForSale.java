package org.example.model;

public abstract class ProductForSale {
    private String type;
    private int price;
    private String description;

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public ProductForSale(String type, int price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public int getSalesPrice(int quantity){
        return  quantity*price;
    }

    public abstract void showDetails();
}
