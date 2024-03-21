public class Food extends Item { // den klasse er en subklasse af Item.mItem contructor er derfor kaldt ind med dens egenskaber.

    //Attributes
    private int healthPoints;

    //Constructor
    public Food(String shortName, String longName, int healthPoints) {
        super(shortName, longName); // kalder item konstruktor ind
        this.healthPoints = healthPoints;
    }

    //getter method
    public int getHealthPoints() {
        return healthPoints;
    }
}
