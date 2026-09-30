package factory;

public class MedievalArmor implements Armor {
    @Override
    public void protectOwner() {
        System.out.println("Equipping heavy steel plate armor and chainmail!");
    }
}