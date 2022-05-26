package com.isep.rpg;

import java.util.List;

public class Mage extends SpellCaster{
    //Constructeur
    public Mage(List<Potion> potions, List<Food> lembas) {
        super(150, 3, 40, potions, lembas, 70);
    }

    //Implémentation de la méthode abstraite attack() héritée de la classe Hero
    @Override
    public void attack() {
        System.out.println("Mage is casting a spell!");
    }

}
