public class MeleeWeapon extends Weapon {
    // MeleeWeapon kan normalt bruges et utal af gange.
    //ATTRIBUTES
    private int damageDoneToOpponent;
   private int damageDoneToOpponentPerStrike;

    //KONSTRUKTØR
    public MeleeWeapon(String shortName, String longName, int damageDoneToOpponent, int damageDoneToOpponentPerStrike) {
        super(shortName, longName);
        this.damageDoneToOpponent = damageDoneToOpponent;
     this.damageDoneToOpponentPerStrike = damageDoneToOpponentPerStrike;
    }

    //GETTER METODE
    public int getDamageDoneToOpponent() {

        return damageDoneToOpponent;
    }

    public int getDamageDoneToOpponentPerStrike(){
        return damageDoneToOpponentPerStrike;}

    @Override
    public void useWeapon() {

    }

    @Override
    public int remainingUses() {
        return 0;
    }

    @Override
    public boolean canUse() {
        return false;
    }
}
