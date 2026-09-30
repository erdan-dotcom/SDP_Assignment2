package factory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameFactoryTest {

    // --- Sci-Fi Factory Tests ---
    @Test
    void testSciFiFactoryNotNull() {
        GameFactory factory = new SciFiFactory();
        assertNotNull(factory);
    }

    @Test
    void testSciFiWeaponNotNull() {
        GameFactory factory = new SciFiFactory();
        Weapon weapon = factory.createWeapon();
        assertNotNull(weapon);
    }

    @Test
    void testSciFiArmorNotNull() {
        GameFactory factory = new SciFiFactory();
        Armor armor = factory.createArmor();
        assertNotNull(armor);
    }

    @Test
    void testSciFiVehicleNotNull() {
        GameFactory factory = new SciFiFactory();
        Vehicle vehicle = factory.createVehicle();
        assertNotNull(vehicle);
    }

    @Test
    void testSciFiProductInstances() {
        GameFactory factory = new SciFiFactory();
        assertInstanceOf(SciFiWeapon.class, factory.createWeapon());
        assertInstanceOf(SciFiArmor.class, factory.createArmor());
        assertInstanceOf(SciFiVehicle.class, factory.createVehicle());
    }

    // --- Medieval Factory Tests ---
    @Test
    void testMedievalFactoryNotNull() {
        GameFactory factory = new MedievalFactory();
        assertNotNull(factory);
    }

    @Test
    void testMedievalWeaponNotNull() {
        GameFactory factory = new MedievalFactory();
        Weapon weapon = factory.createWeapon();
        assertNotNull(weapon);
    }

    @Test
    void testMedievalArmorNotNull() {
        GameFactory factory = new MedievalFactory();
        Armor armor = factory.createArmor();
        assertNotNull(armor);
    }

    @Test
    void testMedievalVehicleNotNull() {
        GameFactory factory = new MedievalFactory();
        Vehicle vehicle = factory.createVehicle();
        assertNotNull(vehicle);
    }

    @Test
    void testMedievalProductInstances() {
        GameFactory factory = new MedievalFactory();
        assertInstanceOf(MedievalWeapon.class, factory.createWeapon());
        assertInstanceOf(MedievalArmor.class, factory.createArmor());
        assertInstanceOf(MedievalVehicle.class, factory.createVehicle());
    }

    // --- Apocalypse Factory Tests ---
    @Test
    void testApocalypseFactoryNotNull() {
        GameFactory factory = new ApocalypseFactory();
        assertNotNull(factory);
    }

    @Test
    void testApocalypseWeaponNotNull() {
        GameFactory factory = new ApocalypseFactory();
        Weapon weapon = factory.createWeapon();
        assertNotNull(weapon);
    }

    @Test
    void testApocalypseArmorNotNull() {
        GameFactory factory = new ApocalypseFactory();
        Armor armor = factory.createArmor();
        assertNotNull(armor);
    }

    @Test
    void testApocalypseVehicleNotNull() {
        GameFactory factory = new ApocalypseFactory();
        Vehicle vehicle = factory.createVehicle();
        assertNotNull(vehicle);
    }

    @Test
    void testApocalypseProductInstances() {
        GameFactory factory = new ApocalypseFactory();
        assertInstanceOf(ApocalypseWeapon.class, factory.createWeapon());
        assertInstanceOf(ApocalypseArmor.class, factory.createArmor());
        assertInstanceOf(ApocalypseVehicle.class, factory.createVehicle());
    }
}