package factory;

public class ApocalypseWeaponFactory extends WeaponFactory {
    @Override
    public Weapon createWeapon() {
        return new ApocalypseWeapon();
    }
}