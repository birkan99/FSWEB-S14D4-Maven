package org.example.model;

public class Store {
    public static void main(String[] args) {
        Store myStore = new Store();
        ProductForSale[] inventory = new ProductForSale[3];
        inventory[0] = new Chocolate("Tablet Çikolata", 25, "Koyu kakao tablet", true);
        inventory[1] = new Coke("Kutu Kola", 18, "Şekersiz kutu kola", 330);
        inventory[2] = new Bread("Somun Ekmek", 12, "Günlük taze beyaz ekmek", false);
        myStore.listProducts(inventory);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}