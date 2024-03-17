public class RangedWeapon extends Weapon {

    //ATTRIBUTES
    private int damageDoneToOpponentPerStrike;
    private int strikesAbleToPerform;
    private int remainingUses;
    private int damageDoneToOpponent;


    //KONSTRUKTØR
    public RangedWeapon( String shortname, String longName , int remainingUses,int damageDoneToOpponent) {
        super(shortname, longName);
        this.remainingUses= remainingUses;
        this.damageDoneToOpponentPerStrike = damageDoneToOpponent;
        this.strikesAbleToPerform = strikesAbleToPerform;
    }

    //GETTER METODE
    public int getStrikesAbleToPerform() {return strikesAbleToPerform;}
    public int getDamageDoneToOpponentPerStrike() {return damageDoneToOpponentPerStrike;}
    public int getDamageDoneToOpponent(){
        return damageDoneToOpponent;
    }

    public int getRemainingUse(){
    return remainingUses;}

    @Override
    public void useWeapon() {
        if(remainingUses>0){
            System.out.println(" you pull your " + getShortName());
            int i = remainingUses--;

        }else {
            System.out.println( "your" + getShortName() + " is out of power");
        }
      
    }

    @Override
    public int remainingUses() {
        return remainingUses;
    }

    @Override
    public boolean canUse() {
        return false;
    }
}
//Override remainingUses method from Weapon class
 // @Override
//public int remainingUses(int strikesAbleToPerform) {
//        this.strikesAbleToPerform = strikesAbleToPerform;
//        return 0;
//    }

//    //Override canUse method from Weapon class


