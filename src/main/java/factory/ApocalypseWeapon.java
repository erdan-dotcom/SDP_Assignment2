package factory;

public class ApocalypseWeapon implements Weapon {
    @Override
    public void useWeapon() {
        System.out.println("Hitting with a rusty spiked bat (Mad Max style)!");
    }
}