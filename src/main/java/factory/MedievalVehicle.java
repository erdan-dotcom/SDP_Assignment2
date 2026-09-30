package factory;

public class MedievalVehicle implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding a battle horse with a royal carriage!");
    }
}