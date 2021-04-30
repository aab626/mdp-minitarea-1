public class TypeWater implements IType{
    public int getDamage(IType type){
        return type.getDamageToWater(this);
    }

    public int getDamageToFire(TypeFire fire){
        return 10;
    }

    public int getDamageToWater(TypeWater water){
        return 5;
    }

    public int getDamageToPlant(TypePlant plant){
        return 5;
    }

    @Override
    public String toString(){
        return "Water";
    }
}
