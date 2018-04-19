package joogid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Joogid {
    
    @RequestMapping("/tervitus")
    String tervita(String eesnimi) {
        return "Tere, " + eesnimi;
    }
    
    @RequestMapping("/vaat1")
    String vaat1() {
        Joogivaat vaat = new Joogivaat(50, 23, new Jook("Kali", 0.15, 1.01));
        Joogipudel p1 = new Joogipudel(0.5, "plastik", 0.01, 0.1, null);
        p1 = vaat.taida(p1);
        return "Vaat: " + vaat + ", pudel: " +p1;
    }
    
    public static void main(String[] arg) {
        SpringApplication.run(Joogid.class, arg);
    }
}
/*public class Joogid {
    public static void main(String[] args) {
        Jook j1 = new Jook("mahl", 0.45, 1.0);
        Jook j2 = new Jook("õlu", 0.55, 0.8);
        Joogipudel p1 = new Joogipudel(1, "klaas", 0.4, 0.1, j1);
        System.out.println(p1);
    }
    
}*/
