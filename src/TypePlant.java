/**
 * Caracteriza el tipo de un Pokémon tipo planta.
 */
public class TypePlant implements IType{
    /**
     * Entrega el daño que se produce cuando un Pokémon de tipo planta es atacado por algún Pokémon de tipo arbitrario.
     * @param type Tipo del Pokémon.
     * @return (int) Daño producido por el ataque.
     */
    public int getDamage(IType type){
        return type.getDamageToPlant(this);
    }

    /**
     * {@inheritDoc}
     */
    public int getDamageToFire(TypeFire fire){
        return 5;
    }

    /**
     * {@inheritDoc}
     */
    public int getDamageToWater(TypeWater water){
        return 10;
    }

    /**
     * {@inheritDoc}
     */
    public int getDamageToPlant(TypePlant plant){
        return 5;
    }

    /**
     * Representación textual del tipo del Pokémon.
     * @return "Plant"
     */
    @Override
    public String toString(){
        return "Plant";
    }
}
