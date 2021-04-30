/**
 * Representa un Pokémon mediante su nombre, especie, puntos de vida y tipo.
 * Interactúa con otros Pokémon al atacarlos, donde el Pokémon atacado pierde puntos de vida.
 * También puede quedar fuera de combate, cuando no le quedan puntos de vida.
 */
public class Pokemon {
    private String name;
    private String species;
    private int healthPoints;
    private IType type;

    /**
     * Constructor de Pokémon.
     * @param name Nombre del Pokémon.
     * @param species Especie del Pokémon.
     * @param healthPoints Puntos de vida actuales del Pokémon.
     * @param type Tipo del Pokémon.
     */
    public Pokemon(String name, String species, int healthPoints, IType type){
        this.name = name;
        this.species = species;
        this.healthPoints = healthPoints;
        this.type = type;
    }

    /**
     * @return Nombre del Pokémon.
     */
    public String getName(){
        return this.name;
    }

    /**
     * @return Especie del Pokémon.
     */
    public String getSpecies(){
        return this.species;
    }

    /**
     * @return Puntos de vida actuales del Pokémon.
     */
    public int getHealthPoints(){
        return this.healthPoints;
    }

    /**
     * @return Tipo del Pokémon.
     */
    public IType getType(){
        return this.type;
    }

    /**
     * Cambia el nombre del Pokémon.
     * @param newName Nuevo nombre del Pokémon.
     */
    public void setName(String newName){
        this.name = newName;
    }

    /**
     * Cambia la especie del Pokémon (En caso de ser necesario).
     * @param newSpecies Nueva especie del Pokémon.
     */
    public void setSpecies(String newSpecies){
        this.species = newSpecies;
    }

    /**
     * Cambia los Puntos de Vida actuales del Pokémon.
     * Asegura que los puntos de vida no sean negativos.
     * @param newHealthPoints Nueva cantidad de Puntos de Vida actuales del Pokémon.
     */
    public void setHealthPoints(int newHealthPoints){
        this.healthPoints = newHealthPoints;
        if (this.healthPoints < 0){
            this.healthPoints = 0;
        }
    }

    /**
     * @return Pokemon(<nombre>, <especie>, <puntos de vida>, <tipo>)
     */
    @Override
    public String toString(){
        return "Pokemon(name: " + this.name + ", species: " + this.species + ", hp: " + this.healthPoints + ", type: " + this.type + ")";
    }

    /**
     * Responde a la pregunta: ¿El Pokémon esta fuera de combate?.
     * @return true si el Pokémon esta fuera de combate (Puntos de vida igual a cero), false de lo contrario.
     */
    public boolean isKnockedOut(){
        return this.healthPoints == 0;
    }

    /**
     * Realiza un ataque desde el Pokémon a otro Pokémon.
     * El daño del ataque está determinado por los tipos, y se sustrae ese daño de los puntos de vida del Pokémon atacado.
     * @param otherPokemon El Pokémon que será atacado.
     */
    public void attackPokemon(Pokemon otherPokemon){
        int damage = otherPokemon.type.getDamage(this.type);
        otherPokemon.setHealthPoints(otherPokemon.healthPoints - damage);
    }

}
