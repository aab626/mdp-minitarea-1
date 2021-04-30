public class Main {
    public static void main(String[] args){
        // solo atacan
        Pokemon pFireAttacker = new Pokemon("charmi", "charmander", 20, new TypeFire());
        Pokemon pWaterAttacker = new Pokemon("squirt", "squirtle", 20, new TypeWater());
        Pokemon pPlantAttacker = new Pokemon("bulba", "bulbasaur", 20, new TypePlant());

        // instanciados de 0 cada vez para corroborar daños
        Pokemon pFire = new Pokemon("charmi", "charmander", 20, new TypeFire());
        Pokemon pWater = new Pokemon("squirt", "squirtle", 20, new TypeWater());
        Pokemon pPlant = new Pokemon("bulba", "bulbasaur", 20, new TypePlant());

        System.out.println("\nRound 1");
        System.out.println(pFire);
        System.out.println(pWater);
        System.out.println(pPlant);

        System.out.println("fire attacks");
        pFireAttacker.attackPokemon(pFire);
        pFireAttacker.attackPokemon(pWater);
        pFireAttacker.attackPokemon(pPlant);

        System.out.println(pFire);
        System.out.println(pWater);
        System.out.println(pPlant);

        // Recuperar vida de los pokemones y atacar otra vez
        pFire.setHealthPoints(20);
        pWater.setHealthPoints(20);
        pPlant.setHealthPoints(20);

        System.out.println("\nRound 2");
        System.out.println(pFire);
        System.out.println(pWater);
        System.out.println(pPlant);

        System.out.println("water attacks");
        pWaterAttacker.attackPokemon(pFire);
        pWaterAttacker.attackPokemon(pWater);
        pWaterAttacker.attackPokemon(pPlant);

        System.out.println(pFire);
        System.out.println(pWater);
        System.out.println(pPlant);

        // Recuperar vida de los pokemones y atacar otra vez
        pFire.setHealthPoints(20);
        pWater.setHealthPoints(20);
        pPlant.setHealthPoints(20);

        System.out.println("\nRound 3");
        System.out.println(pFire);
        System.out.println(pWater);
        System.out.println(pPlant);

        System.out.println("plant attacks");
        pPlantAttacker.attackPokemon(pFire);
        pPlantAttacker.attackPokemon(pWater);
        pPlantAttacker.attackPokemon(pPlant);

        System.out.println(pFire);
        System.out.println(pWater);
        System.out.println(pPlant);

        // Recuperar vida de los pokemones
        pFire.setHealthPoints(7);

        System.out.println("\nRound 4: KO Test");
        System.out.println(pFire);
        System.out.println("plant attacks ");
        pPlantAttacker.attackPokemon(pFire);
        System.out.println(pFire);
        System.out.println("fire ko? " + pFire.isKnockedOut());

        System.out.println("plant attacks ");
        pPlantAttacker.attackPokemon(pFire);
        System.out.println(pFire);
        System.out.println("fire ko? " + pFire.isKnockedOut());

    }
}
