
public class Item {
    private String shortName;
    private String longName;



    public Item(String shortName, String longName) {
        this.longName = longName;
        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }

    public String getLongName() {
        return longName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }
    @Override
    public String toString() {
        return getLongName();
    }

}
