package org.example.model;

public class Bread extends ProductForSale{
    private boolean isWholeWheat;

    public Bread(String type, int price, String description, boolean isWholeWheat) {
        super(type, price, description);
        this.isWholeWheat = isWholeWheat;
    }
    public Bread(String type, int price, String description) {
        super(type, price, description);

    }

    @Override
    public void showDetails() {
        System.out.println("Tip: " + getType());
        System.out.println("Fiyat: " + getPrice() + " TL");
        System.out.println("Açıklama: " + getDescription());
        System.out.println("Tam Buğday mı: " + (isWholeWheat ? "Evet" : "Hayır"));
        System.out.println("Satış Fiyatı (1 adet): " + getSalesPrice(1) + " TL");
        System.out.println("-----------------------");
    }
}