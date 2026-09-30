package factory;

public class ApocalypseArmor implements Armor {
    @Override
    public void protectOwner() {
        System.out.println("Strapping on makeshift scrap metal and leather pads!");
    }
}