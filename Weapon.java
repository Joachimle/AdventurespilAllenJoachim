public class Weapon {
    private String shortName;
    private String longName;

    public Weapon(String shortName, String longName) {
        this.longName = longName;
        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }

    public String getLongName() {
        return longName;
    }

    public void setShortName() {
        this.shortName = shortName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }
}
