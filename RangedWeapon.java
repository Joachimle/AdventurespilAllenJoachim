public class RangedWeapon extends Weapon {

    //ATTRIBUTES
    private int damageDoneToOpponentPerStrike;
    private int remainingUses;


    //KONSTRUKTØR
    public RangedWeapon( String shortname, String longName , int remainingUses,int damageDoneToOpponentPerStrike) {
        super(shortname, longName);
        this.remainingUses= remainingUses;
        this.damageDoneToOpponentPerStrike = damageDoneToOpponentPerStrike;
    }

    //GETTER METODE
    public int getDamageDoneToOpponentPerStrike() {
        return damageDoneToOpponentPerStrike;
    }

    public int getRemainingUse(){
        return remainingUses;
    }

    @Override
    public void useWeapon() {
        if(remainingUses>0){
            System.out.println(" you pull your " + getShortName());
            remainingUses --;

        }else {
            System.out.println( "your" + getShortName() + " is out of power");
        }
    }

    @Override
    public boolean canUse() {
        return false;
    }
}



