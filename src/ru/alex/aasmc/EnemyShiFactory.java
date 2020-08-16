package ru.alex.aasmc;

public class EnemyShiFactory {
    public EnemyShip makeEnemyShip(String newShipType) {
        return switch (newShipType) {
            case "U" -> new UFOEnemyShip();
            case "R" -> new RocketEnemyShip();
            case "B" -> new BigUFOEnemyShip();
            default -> null;
        };
    }
}
