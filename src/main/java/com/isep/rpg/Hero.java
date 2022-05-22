package com.isep.rpg;

import java.util.List;

public abstract class Hero {
    //Paramètres
    private int lifePoints;
    private int armor;
    private int weaponDamage;
    private List<Potion> potions;
    private List<Food> lembas;

    //Constructeur

    public Hero(int lifePoints, int armor, int weaponDamage, List<Potion> potions, List<Food> lembas) {
        this.lifePoints = lifePoints;
        this.armor = armor;
        this.weaponDamage = weaponDamage;
        this.potions = potions;
        this.lembas = lembas;
    }

    //Méthodes abstraites
    public abstract void attack();
    public abstract void defend();
    public abstract void useConsumable(); //Consumable en paramètre!!

    //Getters
    public int getLifePoints() {
        return lifePoints;
    }

    public int getArmor() {
        return armor;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public List<Potion> getPotions() {
        return potions;
    }

    public List<Food> getLembas() {
        return lembas;
    }
}
