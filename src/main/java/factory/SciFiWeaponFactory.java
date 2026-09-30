package factory;

public class SciFiWeaponFactory extends WeaponFactory {
    @Override
    public Weapon createWeapon() {
        return new SciFiWeapon();
    }
}