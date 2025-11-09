package org.example.model;

public class Chocolate extends ProductForSale{
    private boolean hasNuts;

    public Chocolate(String type, int price, String description, boolean hasNuts) {
        super(type, price, description);
        this.hasNuts = hasNuts;
    }

    public Chocolate(String type, int price, String description) {
        super(type, price, description);

    }

    @Override
    public void showDetails() {
        System.out.println("Tip: " + getType());
        System.out.println("Fiyat: " + getPrice() + " TL");
        System.out.println("Açıklama: " + getDescription());
        System.out.println("Kuruyemiş İçerir mi: " + (hasNuts ? "Evet" : "Hayır"));
        System.out.println("Satış Fiyatı (1 adet): " + getSalesPrice(1) + " TL");
        System.out.println("--------------------------");
    }
}