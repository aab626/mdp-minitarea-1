/**
 * Caracteriza el tipo de un Pokémon tipo fuego.
 */
public class TypeFire implements IType{
    /**
     * Entrega el daño que se produce cuando un Pokémon de tipo fuego es atacado por algún Pokémon de tipo arbitrario.
     * @param type Tipo del Pokémon.
     * @return (int) Daño producido por el ataque.
     */
    public int getDamage(IType type){
        return type.getDamageToFire(this);
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
        return 5;
    }

    /**
     * {@inheritDoc}
     */
    public int getDamageToPlant(TypePlant plant){
        return 10;
    }

    /**
     * Representación textual del tipo del Pokémon.
     * @return "Fire"
     */
    @Override
    public String toString(){
        return "Fire";
    }
}
