package joogid;
public class Joogipudel {
    public double maht;
    public String pudelityyp;
    public double mass;
    public double taarahind;
    public Jook sisu;
    
    public Joogipudel (double maht, String pudelityyp, double mass, double taarahind, Jook sisu) {
        this.maht = maht;
        this.pudelityyp = pudelityyp;
        this.mass = mass;
        this.taarahind = taarahind;
        this.sisu = sisu;
    }
    
    public double koguMass () {
        if (sisu == null) {
            return mass;
        } else {
            return mass + sisu.erikaal*maht;
        }   
    }
    
    public double koguHind () {
        if (sisu == null) {
            return taarahind;
        } else {
            return taarahind + maht*sisu.omahind;
        }
    }
    
    @Override
    public String toString () {
        return maht + "-liitrine pudel tüübiga " + pudelityyp + ", sisuks " + sisu + ", kogumassiga " + koguMass() + ", koguhinnaga " + koguHind();
    }
}
