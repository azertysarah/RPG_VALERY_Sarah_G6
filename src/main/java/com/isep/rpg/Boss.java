package com.isep.rpg;

public class Boss extends Enemy{

    //Constructeur
    public Boss(int lifePoints, int Damage) {
        super(350, 40);
    }

    //Implémentation des méthodes abstraites héritées de la classe Enemy
    @Override
    public void attack() {
        System.out.println("A boss is attacking!");
    }
}
