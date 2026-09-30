package factory;

public class MedievalWeapon implements Weapon {
    @Override
    public void useWeapon() {
        System.out.println("Swinging a sharp Steel Sword!");
    }
}