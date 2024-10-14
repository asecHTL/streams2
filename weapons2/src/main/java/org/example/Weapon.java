package org.example;

public class Weapon {
    private String name;
    private double attackPoints;
    private String category;
    private double weight;
    private double price;
    private String itemID;

    public Weapon(String name, double attackPoints, String category, double weight, double price, String itemID) {
        this.name = name;
        this.attackPoints = attackPoints;
        this.category = category;
        this.weight = weight;
        this.price = price;
        this.itemID = itemID;
    }

    @Override
    public String toString() {
        return "\n Weapon:" + this.name + "\n        " + this.attackPoints + "\n        " + this.category + "\n        " + this.weight + "\n        " + this.price + "\n        " + this.itemID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(double attackPoints) {
        this.attackPoints = attackPoints;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }
}
