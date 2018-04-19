import joogid.Joogipudel;
import joogid.Joogivaat;
import joogid.Jook;
import org.junit.Test;
import static org.junit.Assert.*;

public class Testid {
    @Test
    public void JoogiTest() {
        Jook vesi = new Jook("mullivesi", 3.5, 1.5);
        assertEquals("mullivesi", vesi.nimetus);
        assertEquals(3.5, vesi.omahind, 0.001);
        assertEquals(1.5, vesi.erikaal, 0.0001);
    }
    @Test
    public void pudel() {
        Jook vesi = new Jook("mullivesi", 3.5, 1.5);
        Joogipudel veePudel = new Joogipudel(0.5, "plastik", 0.02, 0.1, vesi);
        Joogipudel tyhiPudel = new Joogipudel(0.5, "plastik", 0.02, 0.1, null);
        assertEquals(0.77, veePudel.koguMass(), 0.01);
        assertEquals(0.02, tyhiPudel.koguMass(), 0.01);
        assertEquals(1.85, veePudel.koguHind(), 0.01);
        assertEquals(0.1, tyhiPudel.koguHind(), 0.01);
        assertEquals("plastik", veePudel.pudelityyp);
    }
    @Test
    public void vaat() {
        Joogivaat vaat = new Joogivaat(50, 23, new Jook("Kali", 0.15, 1.01));
        assertEquals(50, vaat.ruumala, 0.01);
        assertEquals(23, vaat.kogus, 0.01);
        assertEquals("Kali", vaat.sisu.nimetus);
        Joogipudel p1 = new Joogipudel(0.5, "plastik", 0.01, 0.1, null);
        p1 = vaat.taida(p1);
        assertEquals("Kali", p1.sisu.nimetus);
        assertEquals(22.5, vaat.kogus, 0.01);
    }
}
