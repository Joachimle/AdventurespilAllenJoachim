public abstract class Weapon extends Item {


    public Weapon(String shortName, String longName) {

        super(shortName, longName); //calls item constructor
    }
    //Weapon methods for use in subclasses
    public abstract void useWeapon();
 public abstract int remainingUses(); //overridden in RangedWeapon class to keep count of remaining uses of the ranged weapon

public abstract boolean canUse(); //overridden in RangedWeapon class to decide if the ranged weapon is usable

}
