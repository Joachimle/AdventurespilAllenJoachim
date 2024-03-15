public class MeleeWeapon extends Item {

    private int damageDoneToOpponent;

    public MeleeWeapon(String shortName, String longName, int damageDoneToOpponentPerStrike) {
        super(shortName, longName);
        this.damageDoneToOpponent = damageDoneToOpponent;
    }

    public int getDamageDoneToOpponent() {
        return damageDoneToOpponent;
    }

}
