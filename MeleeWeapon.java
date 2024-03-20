public class MeleeWeapon extends Weapon {
    // MeleeWeapon kan normalt bruges et utal af gange.
    //ATTRIBUTES

    //KONSTRUKTØR
    public MeleeWeapon(String shortName, String longName, int damagePerAttack) {
        super(shortName, longName, damagePerAttack);
    }

    @Override
    public boolean canUse() {
        return true;
    }
}
