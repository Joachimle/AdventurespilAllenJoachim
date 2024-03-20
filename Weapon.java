public abstract class Weapon extends Item {

    //Attributes
    private int damagePerAttack;
    private int remainingUses;

    //Constructor
    public Weapon(String shortName, String longName, int damagePerAttack) {
        super(shortName, longName); //calls item constructor
        this.damagePerAttack = damagePerAttack;
    }

    //Getter
    public int getDamagePerAttack() {
        return damagePerAttack;
    }

    public void setDamagePerAttack(int damagePerAttack) {
        this.damagePerAttack = damagePerAttack;
    }

    public int getRemainingUses() {
        return remainingUses;
    }

    public void setRemainingUses(int remainingUses) {
        this.remainingUses = remainingUses;
    }

    public abstract boolean canUse() ; //overridden in RangedWeapon class to decide if the ranged weapon is usable
}
