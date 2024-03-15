public class Food extends Item { // den klasse er en subklasse af Item.mItem contructor er derfor kaldt ind med dens egenskaber.

    //Attributer
    private int healthPoints;

    //contructor
    public Food(String shortName,String longName, String healthpoints){
super(shortName, longName); // kalder item kontruktor ind
        this.healthPoints = Integer.parseInt(healthpoints); // burger parseint fordi healthPoins kan blive sat til et negativ tal.
    }

    //getter metod
    public int getHealthPoints(){
        return healthPoints;
    }
}
