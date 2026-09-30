package factory;

public class SciFiVehicle implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Hovering in a futuristic anti-gravity cruiser!");
    }
}