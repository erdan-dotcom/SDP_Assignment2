package factory;

public class GameClient {
    public static void main(String[] args) {
        System.out.println("=== TESTING SCI-FI FACTION ===");
        runGame(new SciFiFactory());

        System.out.println("\n=== TESTING MEDIEVAL FACTION ===");
        runGame(new MedievalFactory());

        System.out.println("\n=== TESTING APOCALYPSE FACTION ===");
        runGame(new ApocalypseFactory());
    }

    public static void runGame(GameFactory factory) {
        Weapon weapon = factory.createWeapon();
        Armor armor = factory.createArmor();
        Vehicle vehicle = factory.createVehicle();

        weapon.useWeapon();
        armor.protectOwner();
        vehicle.drive();
    }
}