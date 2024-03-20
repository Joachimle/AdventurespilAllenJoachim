public abstract class Weapon extends Item {

    //Attributes
    private int damagePerAttack;
    private int ammo;

    //Constructor
    public Weapon(String shortName, String longName, int damagePerAttack) {
        super(shortName, longName); //calls item constructor
        this.damagePerAttack = damagePerAttack;
    }

    //Getter
    public int getDamagePerAttack() {
        return damagePerAttack;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setDamagePerAttack(int damagePerAttack) {
        this.damagePerAttack = damagePerAttack;
    }

    //public abstract int remainingUses(); //overridden in RangedWeapon class to keep count of remaining uses of the ranged weapon

    public abstract boolean canUse() ; //overridden in RangedWeapon class to decide if the ranged weapon is usable
}
