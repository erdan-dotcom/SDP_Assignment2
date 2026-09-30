package factory;

public class MedievalFactory implements GameFactory {
    @Override
    public Weapon createWeapon() {
        return new MedievalWeapon();
    }

    @Override
    public Armor createArmor() {
        return new MedievalArmor();
    }

    @Override
    public Vehicle createVehicle() {
        return new MedievalVehicle();
    }
}