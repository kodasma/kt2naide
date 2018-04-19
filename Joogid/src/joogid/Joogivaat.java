package joogid;
public class Joogivaat {
    public double ruumala;
    public double kogus;
    public Jook sisu;
    
    public Joogivaat (double ruumala, double kogus, Jook sisu) {
        this.ruumala = ruumala;
        this.kogus = kogus;
        this.sisu = sisu;
    }
    
    public Joogipudel taida(Joogipudel pudel) {
        if (pudel.sisu != null) {
            return pudel;
        }
        if (pudel.maht > this.kogus) {
            return pudel;
        }
        kogus -= pudel.maht;
        pudel.sisu = this.sisu;
        return pudel;
    }
}
