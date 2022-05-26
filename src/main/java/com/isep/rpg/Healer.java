package com.isep.rpg;

import java.util.List;

public class Healer extends SpellCaster{
    //Constructeur
    public Healer(List<Potion> potions, List<Food> lembas) {
        super(150, 2, 30, potions, lembas, 100);
    }

    //Implémentation de la méthode abstraite attack() héritée de la classe Hero
    @Override
    public void attack() {
        System.out.println("Healer is healing!");
    }
}
