package com.isep.rpg;

public abstract class Enemy {
    //Paramètres
    private int LifePoints;
    private int Damage;

    //Constructeur
    public Enemy(int LifePoints, int Damage) {
        LifePoints = this.LifePoints;
        Damage = this.Damage;
    }

    //Pas de méthode abstraite pour l'attaque des ennemies parce que ce sont les mêmes
    public void attack(){

    }
}
