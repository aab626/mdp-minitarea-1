public class Pokemon {
    private String name;
    private String species;
    private int healthPoints;
    private IType type;

    // Constructor
    public Pokemon(String name, String species, int healthPoints, IType type){
        this.name = name;
        this.species = species;
        this.healthPoints = healthPoints;
        this.type = type;
    }

    // Getters
    public String getName(){
        return this.name;
    }

    public String getSpecies(){
        return this.species;
    }

    public int getHealthPoints(){
        return this.healthPoints;
    }

    public IType getType(){
        return this.type;
    }

    // Setters
    public void setName(String newName){
        this.name = newName;
    }

    public void setSpecies(String newSpecies){
        this.species = newSpecies;
    }

    public void setHealthPoints(int newHealthPoints){
        this.healthPoints = newHealthPoints;
    }

    // Representacion visual del Pokemon
    @Override
    public String toString(){
        String s = "Pokemon(name: " + this.name + ", species: " + this.species + ", hp: " + this.healthPoints + ", type: " + this.type + ")";
        return s;
    }

    // Retorna true si esta fuera de combate, false si no
    public boolean isKnockedOut(){
        return this.healthPoints == 0;
    }

    // ataque
    public void attackPokemon(Pokemon otherPokemon){
        int damage = otherPokemon.type.getDamage(this.type);
        otherPokemon.takeDamage(damage);
    }

    // Metodo para tomar daño, asegurar q el min sea 0
    public void takeDamage(int damage){
        this.healthPoints -= damage;
        if (this.healthPoints < 0){
            this.healthPoints = 0;
        }
    }

}
