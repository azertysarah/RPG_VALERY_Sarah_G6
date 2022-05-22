package com.isep.rpg;

import java.util.List;

public class Healer extends SpellCaster{
    //Constructeur
    public Healer(int lifePoints, int armor, int weaponDamage, List<Potion> potions, List<Food> lembas, int manaPoints) {
        super(lifePoints, armor, weaponDamage, potions, lembas, manaPoints);
    }

    //Implémentation de la méthode abstraite attack() héritée de la classe Hero
    @Override
    public void attack() {
        System.out.println("Healer is healing!");
    }
}
