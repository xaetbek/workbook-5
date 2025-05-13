package org.pluralsight;

public class Enemy extends Character {
    public Enemy(String name, int hp, int attack) {
        super(name, hp, attack);
    }

    void makeMove(Character target) {
        int move = (int) (Math.random() * 4); // Random number 0–3

        switch (move) {
            case 0:
                this.attack(target);
                break;
            case 1:
                this.fireball(target);
                break;
            case 2:
                this.heal();
                break;
            case 3:
                this.run(); // could change this to something more meaningful later
                break;
            default:
                System.out.println(name + " is confused and does nothing.");
        }
    }
}
