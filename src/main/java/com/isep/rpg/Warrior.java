package com.isep.rpg;

import java.util.List;

public class Warrior extends Hero{
    //Constructeur
    public Warrior(int lifePoints, int armor, int weaponDamage, List<Potion> potions, List<Food> lembas) {
        super(lifePoints, armor, weaponDamage, potions, lembas);
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
