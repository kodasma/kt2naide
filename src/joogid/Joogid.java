package joogid;

public class Joogid {
    public static void main(String[] args) {
        Jook j1 = new Jook("mahl", 0.45, 1.0);
        Jook j2 = new Jook("õlu", 0.55, 0.8);
        Joogipudel p1 = new Joogipudel(1, "klaas", 0.4, 0.1, j1);
        System.out.println(p1);
    }
    
}
