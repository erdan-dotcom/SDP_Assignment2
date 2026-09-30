package factory;

public class SciFiArmor implements Armor {
    @Override
    public void protectOwner() {
        System.out.println("Engaging energy shielding grid!");
    }
}