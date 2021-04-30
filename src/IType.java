/**
 * Interface para los Tipos de Pokémon.
 * Asegura la compatibilidad entre instancias mediante Double Dispatch.
 */
public interface IType {
    /**
     * Calcula el daño que se produce cuando un Pokémon de este tipo ataca a otro Pokémon con su propio tipo.
     * @param type Tipo del Pokémon.
     * @return (int) Daño producido por el ataque.
     */
    int getDamage(IType type);

    /**
     * Entrega el daño producido a un Pokémon de tipo fuego.
     * @param fire Tipo fuego (De un Pokémon)
     * @return (int) Daño producido por el ataque.
     */
    int getDamageToFire(TypeFire fire);

    /**
     * Entrega el daño producido a un Pokémon de tipo agua.
     * @param water Tipo agua (De un Pokémon)
     * @return (int) Daño producido por el ataque.
     */
    int getDamageToWater(TypeWater water);

    /**
     * Entrega el daño producido a un Pokémon de tipo planta.
     * @param plant Tipo fuego (De un Pokémon)
     * @return (int) Daño producido por el ataque.
     */
    int getDamageToPlant(TypePlant plant);
}
