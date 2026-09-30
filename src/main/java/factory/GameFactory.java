package factory;

public interface GameFactory {
    Weapon createWeapon();
    Armor createArmor();
    Vehicle createVehicle();
}