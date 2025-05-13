package org.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Warrior player = new Warrior("YearUp Warrior", 40, 8);
        Enemy monster = new Enemy("Enemy", 30, 6);

        System.out.println(" Welcome to the Code Dungeon!");
        System.out.println("A wild " + monster.name + " appears!");

        while (player.isAlive() && monster.isAlive()) {
            System.out.println("\nYour HP: " + player.hp + " | Enemy HP: " + monster.hp);
            System.out.println("Choose an action:");
            System.out.println("1. Attack");
            System.out.println("2. Fireball");
            System.out.println("3. Heal");
            System.out.println("4. HP Spin Attack");
            System.out.println("5. Run");
            System.out.print("> ");

            String choice = input.nextLine();

            if (choice.equals("1")) {
                player.attack(monster);
                if (monster.isAlive()) monster.makeMove(player);
            } else if (choice.equals("2")) {
                player.fireball(monster);
                if (monster.isAlive()) monster.makeMove(player);
            } else if (choice.equals("3")) {
                player.heal();
                if (monster.isAlive()) monster.makeMove(player);
            } else if (choice.equals("4")) {
                player.hpSpinAttack(monster);
                if (monster.isAlive()) monster.makeMove(player);
            } else if (choice.equals("5")) {
                player.run();
                if (monster.isAlive()) monster.makeMove(player);
            } else {
                System.out.println("Invalid choice. Try again.");
            }



            if (!player.isAlive()) {
                System.out.println("\nYou have been defeated by " + monster.name + "!");
            } else if (!monster.isAlive()) {
                System.out.println("\nYou defeated " + monster.name + "! Victory!");
            }
        }
        input.close();
    }
}