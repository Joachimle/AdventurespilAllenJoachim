public class RangedWeapon extends Weapon {

    //ATTRIBUTES
    private int damageDoneToOpponentPerStrike;
    private int StrikesAbleToPerform;

    //KONSTRUKTØR
    public RangedWeapon(String shortName, String longName, int damageDoneToOpponent, int StrikesAbleToPerform) {
        super(shortName, longName);
        this.damageDoneToOpponentPerStrike = damageDoneToOpponent;
        this.StrikesAbleToPerform = StrikesAbleToPerform;
    }

    //GETTER METODE
    public int getStrikesAbleToPerform() {
        return StrikesAbleToPerform;
    }
    public int getDamageDoneToOpponentPerStrike() {
        return damageDoneToOpponentPerStrike;
    }

}
