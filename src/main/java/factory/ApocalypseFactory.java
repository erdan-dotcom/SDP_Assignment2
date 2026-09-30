package factory;

public class ApocalypseFactory implements GameFactory {
    @Override
    public Weapon createWeapon() {
        return new ApocalypseWeapon();
    }

    @Override
    public Armor createArmor() {
        return new ApocalypseArmor();
    }

    @Override
    public Vehicle createVehicle() {
        return new ApocalypseVehicle();
    }
}