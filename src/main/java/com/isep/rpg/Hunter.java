package com.isep.rpg;

import java.util.List;

public class Hunter extends Hero{
    private int arrows;

    //Constructeur
    public Hunter(int lifePoints, int armor, int weaponDamage, List<Potion> potions, List<Food> lembas, int arrows) {
        super(lifePoints, armor, weaponDamage, potions, lembas);
        this.arrows = arrows;
    }

    //Implémentation des méthodes abstraites héritées de la classe Hero
    @Override
    public void attack() {
        System.out.println("Hunter is attacking!");
    }

    @Override
    public void defend() {
        System.out.println("Hunter is defending!");
    }

    @Override
    public void useConsumable() {
        System.out.println("Hunter uses a consumable");
    }
}
