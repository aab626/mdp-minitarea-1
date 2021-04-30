public class TypePlant implements IType{
    public int getDamage(IType type){
        return type.getDamageToPlant(this);
    }

    public int getDamageToFire(TypeFire fire){
        return 5;
    }

    public int getDamageToWater(TypeWater water){
        return 10;
    }

    public int getDamageToPlant(TypePlant plant){
        return 5;
    }

    @Override
    public String toString(){
        return "Plant";
    }
}
