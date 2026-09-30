package factory;

public class MedievalWeaponFactory extends WeaponFactory {
    @Override
    public Weapon createWeapon() {
        return new MedievalWeapon();
    }
}