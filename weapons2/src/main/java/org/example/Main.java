package org.example;

import java.io.File;
import java.nio.file.Files;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;



public class Main implements IWeapon {
    private static int averageAttackPoints;
    private static Player player;
    public static void main(String[] args) {
        List<Weapon>weapons = new LinkedList<>();
        weapons = readWeapons(weapons);
        player = new Player("Simon Humer", 200,5,weapons);
        System.out.println(player);

        findWithMostAttackPoints();

    }

    public static List<Weapon> readWeapons(List<Weapon> list) {


        list.clear();
        try{
            list = Files.lines(new File("weapons.csv").toPath())
                    .skip(1)
                    .map(s -> s.split(";"))
                    .map(s -> new Weapon(
                            s[0],
                            Double.parseDouble(s[1]),
                            s[2],
                            Double.parseDouble(s[3]),
                            Double.parseDouble(s[4]),
                            (s[5])

                            ))
                    .collect(Collectors.toList());

        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }


    @Override
    public List<Weapon> findWhereItemIDStartsWith(String searchString) {
        return Collections.emptyList();
    }

    @Override
    public Weapon findWithItemID(String itemID) {
        return null;
    }

    @Override
    public List<Weapon> findWithCategory(String category) {
        return Collections.emptyList();
    }

    @Override
    public int sumPrice() {
        return 0;
    }

    @Override
    public int averageAttackPoints() {
        return 0;
    }

    @Override
    public Weapon findWithMostAttackPoints() {
        double highestAttack = 0;
        List<Weapon>weapons = player.getWeapons();
        Weapon weapon = null;
        Weapon highest = null;
        for (int i = 0; i < weapons.size(); i++) {
            weapon = weapons.get(i);
            if (weapon.getAttackPoints() > highestAttack){
                highest = weapons.get(i);
                highestAttack = weapon.getAttackPoints();
            }
        }
        return highest;
    }

    @Override
    public List<Weapon> findWeightUnder(float weight) {
        return Collections.emptyList();
    }

    @Override
    public List<Weapon> carryAbleWeapons(Player player) {
        return Collections.emptyList();
    }
}