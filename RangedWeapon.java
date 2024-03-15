public class RangedWeapon extends Item {

    private int damageDoneToOpponentPerStrike;
    private int StrikesAbleToPerform;

    public RangedWeapon(String shortName, String longName, int damageDoneToOpponent, int StrikesAbleToPerform) {
        super(shortName, longName);
        this.damageDoneToOpponentPerStrike = damageDoneToOpponent;
        this.StrikesAbleToPerform = StrikesAbleToPerform;
    }

    public int getStrikesAbleToPerform() {
        return StrikesAbleToPerform;
    }

    public int getDamageDoneToOpponentPerStrike() {
        return damageDoneToOpponentPerStrike;
    }

}
