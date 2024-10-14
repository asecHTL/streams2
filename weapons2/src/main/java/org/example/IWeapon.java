package org.example;

import java.util.List;

public interface IWeapon {
    List<Weapon> findWhereItemIDStartsWith(String searchString);
    Weapon findWithItemID(String itemID);
    List<Weapon> findWithCategory(String category);
    int sumPrice();
    int averageAttackPoints();
    Weapon findWithMostAttackPoints();
    List<Weapon> findWeightUnder(float weight);

    // findet alle Weapons, die der übergebene Spieler noch tragen kann
    // carryable = (maxWeight - Gewicht der Waffen, die der Spieler bereits trägt)
    List<Weapon> carryAbleWeapons(Player player);
}
