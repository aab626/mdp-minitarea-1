import org.junit.Test;

import static org.junit.Assert.*;

/** Test unitarios para las clases TypeFire, TypeWater, TypePlant */
public class TypeTest {
    // Tipos de prueba
    TypeFire fire = new TypeFire();
    TypeWater water = new TypeWater();
    TypePlant plant = new TypePlant();

    /** Test de daños producidos entre todos los tipos */
    @Test
    public void getDamage() {
        // Daño receibido por un tipo fuego
        assertEquals(5, fire.getDamage(fire));
        assertEquals(10, fire.getDamage(water));
        assertEquals(5, fire.getDamage(plant));

        // Daño receibido por un tipo agua
        assertEquals(5, water.getDamage(fire));
        assertEquals(5, water.getDamage(water));
        assertEquals(10, water.getDamage(plant));

        // Daño receibido por un tipo planta
        assertEquals(10, plant.getDamage(fire));
        assertEquals(5, plant.getDamage(water));
        assertEquals(5, plant.getDamage(plant));
    }

    /** Test de daños producidos por todos los tipos al tipo fuego. */
    @Test
    public void getDamageToFire() {
        // Daños producidos por todos los tipos al tipo fuego.
        assertEquals(5, fire.getDamageToFire(fire));
        assertEquals(10, water.getDamageToFire(fire));
        assertEquals(5, plant.getDamageToFire(fire));
    }

    /** Test de daños producidos por todos los tipos al tipo agua. */
    @Test
    public void getDamageToWater() {
        assertEquals(5, fire.getDamageToWater(water));
        assertEquals(5, water.getDamageToWater(water));
        assertEquals(10, plant.getDamageToWater(water));
    }

    /** Test de daños producidos por todos los tipos al tipo planta. */
    @Test
    public void getDamageToPlant() {
        assertEquals(10, fire.getDamageToPlant(plant));
        assertEquals(5, water.getDamageToPlant(plant));
        assertEquals(5, plant.getDamageToPlant(plant));
    }
}