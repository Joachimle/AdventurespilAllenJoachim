public class MeleeWeapon extends Weapon {

    //ATTRIBUTES
    private int damageDoneToOpponent;

    //KONSTRUKTØR
    public MeleeWeapon(String shortName, String longName, int damageDoneToOpponentPerStrike) {
        super(shortName, longName);
        this.damageDoneToOpponent = damageDoneToOpponent;
    }

    //GETTER METODE
    public int getDamageDoneToOpponent() {
        return damageDoneToOpponent;
    }
}
