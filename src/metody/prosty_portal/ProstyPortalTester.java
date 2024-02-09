package metody.prosty_portal;

import metody.prosty_portal.ProstyPortal;
import metody.prosty_portal.ProstyPortalGra;

public class ProstyPortalTester {
    public static void main(String[] args) {
        ProstyPortalGra prostyPortalGra = new ProstyPortalGra();
        prostyPortalGra.graj();

        System.exit(0);
        ProstyPortal wit = new ProstyPortal();
        int[] polozenia = {2, 3, 4};
        wit.setPolaPolozenia(polozenia);
        String wybranePole = "2";
        String wynik = wit.sprawdz(wybranePole);
    }
}
