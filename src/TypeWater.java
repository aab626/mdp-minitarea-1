/**
 * Caracteriza el tipo de un Pokémon tipo agua.
 */
public class TypeWater implements IType{
    /**
     * Entrega el daño que se produce cuando un Pokémon de tipo agua es atacado por algún Pokémon de tipo arbitrario.
     * @param type Tipo del Pokémon.
     * @return (int) Daño producido por el ataque.
     */
    public int getDamage(IType type){
        return type.getDamageToWater(this);
    }

    /**
     * {@inheritDoc}
     */
    public int getDamageToFire(TypeFire fire){
        return 10;
    }

    /**
     * {@inheritDoc}
     */
    public int getDamageToWater(TypeWater water){
        return 5;
    }

    /**
     * {@inheritDoc}
     */
    public int getDamageToPlant(TypePlant plant){
        return 5;
    }

    /**
     * Representación textual del tipo del Pokémon.
     * @return "Water"
     */
    @Override
    public String toString(){
        return "Water";
    }
}
