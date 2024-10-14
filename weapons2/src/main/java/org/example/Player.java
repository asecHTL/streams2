package org.example;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private double maxWeight;
    private double carrying;

    private List<Weapon>weapons = new ArrayList<>();

    public Player(String name, double maxWeight, double carrying, List<Weapon> weapons) {
        this.name = name;
        this.maxWeight = maxWeight;
        this.carrying = carrying;
        this.weapons = weapons;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", maxWeight=" + maxWeight +
                ", carrying=" + carrying +
                ", weapons=" + weapons +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public double getCarrying() {
        return carrying;
    }

    public void setCarrying(double carrying) {
        this.carrying = carrying;
    }

    public List<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<Weapon> weapons) {
        this.weapons = weapons;
    }
}
