package org.example.model;

public class Coke extends ProductForSale{
    private int volumeMl;
    public Coke(String type, int price, String description,int volumeMl) {
        super(type, price, description);
        this.volumeMl=volumeMl;
    }

    public Coke(String type, int price, String description) {
        super(type, price, description);

    }

    @Override
    public void showDetails() {
        System.out.println("Tip: " + getType());
        System.out.println("Fiyat: " + getPrice() + " TL");
        System.out.println("Açıklama: " + getDescription());
        System.out.println("Hacim: " + volumeMl + " ml");
        System.out.println("Satış Fiyatı (1 adet): " + getSalesPrice(1) + " TL");
        System.out.println("----------------------");
    }
}
