import org.junit.Test;

import static org.junit.Assert.*;

/** Tests unitarios para la clase Pokémon */
public class PokemonTest {
    // Pokémon de prueba
    Pokemon pokemonFire = new Pokemon("Charma", "Charmander", 20, new TypeFire());
    Pokemon pokemonWater = new Pokemon("Squirt", "Squirtle", 20, new TypeWater());
    Pokemon pokemonPlant = new Pokemon("Bulba", "Bulbasaur", 20, new TypePlant());

    Pokemon pokemonFireDummy = new Pokemon("Charma", "Charmander", 20, new TypeFire());
    Pokemon pokemonWaterDummy = new Pokemon("Squirt", "Squirtle", 20, new TypeWater());
    Pokemon pokemonPlantDummy = new Pokemon("Bulba", "Bulbasaur", 20, new TypePlant());

    @Test
    public void getName() {
        assertEquals("Charma", pokemonFire.getName());
    }

    @Test
    public void getSpecies() {
        assertEquals("Charmander", pokemonFire.getSpecies());
    }

    @Test
    public void getHealthPoints() {
        assertEquals(20, pokemonFire.getHealthPoints());
    }

    @Test
    public void getType() {
        assertTrue(pokemonFire.getType() instanceof TypeFire);
        assertTrue(pokemonWater.getType() instanceof TypeWater);
        assertTrue(pokemonPlant.getType() instanceof TypePlant);
    }

    @Test
    public void setName() {
        pokemonFire.setName("testName");
        assertEquals("testName", pokemonFire.getName());
    }

    @Test
    public void setSpecies() {
        pokemonFire.setSpecies("testSpecies");
        assertEquals("testSpecies", pokemonFire.getSpecies());
    }

    @Test
    public void setHealthPoints() {
        pokemonFire.setHealthPoints(7);
        assertEquals(7, pokemonFire.getHealthPoints());
    }

    @Test
    public void testToString() {
        assertEquals("Pokemon(name: Charma, species: Charmander, hp: 20, type: Fire)", pokemonFire.toString());
    }

    @Test
    public void isKnockedOut() {
        // Pokémon no fuera de combate (20 Puntos de vida)
        assertFalse(pokemonFire.isKnockedOut());

        pokemonFire.setHealthPoints(1);
        assertFalse(pokemonFire.isKnockedOut());

        // Ahora el Pokémon está fuera de combate (0 y negativos Puntos de vida)
        pokemonFire.setHealthPoints(0);
        assertTrue(pokemonFire.isKnockedOut());

        pokemonFire.setHealthPoints(-73423);
        assertTrue(pokemonFire.isKnockedOut());
    }

    /** Test unitario de ataques desde un Pokémon de tipo fuego */
    @Test
    public void attackPokemonFire() {
        // Ataques a un Pokémon tipo fuego, agua y planta (en ese orden).
        pokemonFire.attackPokemon(pokemonFireDummy);
        assertEquals(15, pokemonFireDummy.getHealthPoints());

        pokemonFire.attackPokemon(pokemonWaterDummy);
        assertEquals(15, pokemonWaterDummy.getHealthPoints());

        pokemonFire.attackPokemon(pokemonPlantDummy);
        assertEquals(10, pokemonPlantDummy.getHealthPoints());
    }

    /** Test unitario de ataques desde un Pokémon de tipo agua */
    @Test
    public void attackPokemonWater() {
        // Ataques a un Pokémon tipo fuego, agua y planta (en ese orden).
        pokemonWater.attackPokemon(pokemonFireDummy);
        assertEquals(10, pokemonFireDummy.getHealthPoints());

        pokemonWater.attackPokemon(pokemonWaterDummy);
        assertEquals(15, pokemonWaterDummy.getHealthPoints());

        pokemonWater.attackPokemon(pokemonPlantDummy);
        assertEquals(15, pokemonPlantDummy.getHealthPoints());
    }

    /** Test unitario de ataques desde un Pokémon de tipo planta */
    @Test
    public void attackPokemonPlant() {
        // Ataques a un Pokémon tipo fuego, agua y planta (en ese orden).
        pokemonPlant.attackPokemon(pokemonFireDummy);
        assertEquals(15, pokemonFireDummy.getHealthPoints());

        pokemonPlant.attackPokemon(pokemonWaterDummy);
        assertEquals(10, pokemonWaterDummy.getHealthPoints());

        pokemonPlant.attackPokemon(pokemonPlantDummy);
        assertEquals(15, pokemonPlantDummy.getHealthPoints());
    }
}