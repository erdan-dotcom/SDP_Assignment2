package factory;

public class SciFiFactory implements GameFactory {
    @Override
    public Weapon createWeapon() {
        return new SciFiWeapon();
    }

    @Override
    public Armor createArmor() {
        return new SciFiArmor();
    }

    @Override
    public Vehicle createVehicle() {
        return new SciFiVehicle();
    }
}