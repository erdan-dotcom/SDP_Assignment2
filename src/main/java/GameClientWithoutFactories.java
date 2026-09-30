public class GameClientWithoutFactories {
    public void setupPlayer(String faction) {
        if (faction.equals("SciFi")) {
            System.out.println("Creating Sci-Fi gear...");
            Object weapon = "Plasma Gun";
            Object armor = "Nano Suit";
            Object vehicle = "Hoverbike";
        } else if (faction.equals("Medieval")) {
            System.out.println("Creating Medieval gear...");
            Object weapon = "Steel Sword";
            Object armor = "Chainmail";
            Object vehicle = "Horse";
        } else {
            throw new IllegalArgumentException("Unknown faction: " + faction);
        }
    }
}