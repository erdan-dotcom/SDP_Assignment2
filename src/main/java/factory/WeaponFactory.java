package factory;

public abstract class WeaponFactory {
    public abstract Weapon createWeapon();

    public void deployWeapon() {
        Weapon weapon = createWeapon();
        System.out.println("Initializing weapon deployment process...");
        weapon.useWeapon();
    }
}