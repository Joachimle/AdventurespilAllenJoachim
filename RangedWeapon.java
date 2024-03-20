public class RangedWeapon extends Weapon {

    //ATTRIBUTES
    private int remainingUses;

    //KONSTRUKTØR
    public RangedWeapon(String shortname, String longName, int remainingUses, int damageDoneToOpponentPerStrike) {
        super(shortname, longName, damageDoneToOpponentPerStrike);
        this.remainingUses = remainingUses;
    }

    public int getRemainingUses() {
        return remainingUses;
    }

    public void setRemainingUses(int remainingUses) {
        this.remainingUses = remainingUses;
    }

    //Metode der siger at hvis der er flere "skud" end 0 i et våben kan vi bruge det
    @Override
    public boolean canUse() {
        return remainingUses > 0;
    }
}



