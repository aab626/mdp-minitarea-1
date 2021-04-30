public class TypeFire implements IType{
    public int getDamage(IType type){
        return type.getDamageToFire(this);
    }

    public int getDamageToFire(TypeFire fire){
        return 5;
    }

    public int getDamageToWater(TypeWater water){
        return 5;
    }

    public int getDamageToPlant(TypePlant plant){
        return 10;
    }

    @Override
    public String toString(){
        return "Fire";
    }
}
