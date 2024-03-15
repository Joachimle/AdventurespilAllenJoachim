public class RangedWeapon extends Weapon {

    //ATTRIBUTES
    private int damageDoneToOpponentPerStrike;
    private int strikesAbleToPerform;

    //KONSTRUKTØR
    public RangedWeapon(String shortName, String longName, int damageDoneToOpponent, int StrikesAbleToPerform) {
        super(shortName, longName);
        this.damageDoneToOpponentPerStrike = damageDoneToOpponent;
        this.strikesAbleToPerform = StrikesAbleToPerform;
    }

    //GETTER METODE
    public int getStrikesAbleToPerform() {
        return strikesAbleToPerform;
    }
    public int getDamageDoneToOpponentPerStrike() {
        return damageDoneToOpponentPerStrike;
    }

//    //Override remainingUses method from Weapon class
//    @Override
//    public int remainingUses(int strikesAbleToPerform) {
//        this.strikesAbleToPerform = strikesAbleToPerform;
//        return 0;
//    }
//
//    //Override canUse method from Weapon class
//    @Override
//    public boolean canUse(int strikesAbleToPerform) {
//        return strikesAbleToPerform > 0;
//    }
}
