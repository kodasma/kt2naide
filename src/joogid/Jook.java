package joogid;
public class Jook {
    public String nimetus;
    public double omahind;
    public double erikaal;
    
    public Jook (String nimetus, double omahind, double erikaal) {
        this.nimetus = nimetus;
        this.omahind = omahind;
        this.erikaal = erikaal;
    }
    
    @Override
    public String toString () {
        return nimetus + ", " + omahind + " €/liiter, " + erikaal + " kg/liiter";
    }
}
