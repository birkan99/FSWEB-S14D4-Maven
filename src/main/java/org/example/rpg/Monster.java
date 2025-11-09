package org.example.rpg;

public abstract class Monster {
    private String name;
    private int hitPoints;
    private double damage;

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public double getDamage() {
        return damage;
    }

    public Monster(String name, int hitPoints, double damage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    public double attack() {
        double totalDamage = getDamage();

        if (this instanceof Bleedable) {
            totalDamage += ((Bleedable) this).bleed();
        }

        if (this instanceof Poisonable) {
            totalDamage += ((Poisonable) this).poison();
        }

        System.out.printf("%s saldırdı! Temel Hasar: %.2f. ", name, getDamage());

        return totalDamage;
    }
}
