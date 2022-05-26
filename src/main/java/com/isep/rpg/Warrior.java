package com.isep.rpg;

import java.util.List;

public class Warrior extends Hero{
    //Constructeur
    public Warrior(List<Potion> potions, List<Food> lembas) {
        super(250, 3, 30, potions, lembas);
    }

    //Implémentation des méthodes abstraites héritées de la classe Hero
    @Override
    public void attack() {

        System.out.println("Warrior is attacking!");
    }

    @Override
    public void defend() {
        System.out.println("Warrior is defending!");
    }

    @Override
    public void useConsumable() {
        System.out.println("Warrior uses a consumable");
    }
}
