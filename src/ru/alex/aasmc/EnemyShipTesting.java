package ru.alex.aasmc;

import java.util.Scanner;

public class EnemyShipTesting {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final EnemyShiFactory factory = new EnemyShiFactory();
        EnemyShip theEnemy = null;

        System.out.println("What type of ship? (U / R / B)");
        if (scanner.hasNextLine()) {
            final String type = scanner.nextLine().toUpperCase();
            theEnemy = factory.makeEnemyShip(type);
        }
        if (theEnemy != null) {
            doStuffEnemy(theEnemy);
        } else {
            System.out.println("Enter U, R, or B");
        }

    }

    private static void doStuffEnemy(EnemyShip theEnemy) {
        theEnemy.displayEnemyShip();
        theEnemy.followHeroShip();
        theEnemy.enemyShipShoots();
    }
}
