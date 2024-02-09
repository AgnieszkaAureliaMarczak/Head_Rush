package metody.portal_max;

import java.util.ArrayList;
import java.util.List;

public class PortalGraMax {
    private PomocnikGry pomocnik;
    private List<Portal> listaPortali = new ArrayList<>();
    private int iloscRuchow = 0;
    private int iloscPortali = 3;

    public PortalGraMax(PomocnikGry pomocnik) {
        this.pomocnik = pomocnik;
    }

    public static void main(String[] args) {
        PortalGraMax portalGraMax = new PortalGraMax(new PomocnikGry());
        portalGraMax.przygotujGre();
    }

    private void przygotujGre() {
        utworzPortaleIWpiszDoTablicy();
        nadajNazwyPortali();
        rozmiescPortaleNaPlanszy();
    }

    private void utworzPortaleIWpiszDoTablicy() {
        for (int i = 0; i < iloscPortali; i++) {
            listaPortali.add(new Portal());
        }
    }

    private void nadajNazwyPortali() {
        listaPortali.get(0).setNazwa("onet.pl");
        listaPortali.get(1).setNazwa("wp.pl");
        listaPortali.get(2).setNazwa("go2.pl");
    }

    private void rozmiescPortaleNaPlanszy() {
        for (int i = 0; i < iloscPortali; i++) {
            ArrayList<String> polaPolozenia = pomocnik.rozmiescPortal(3);
            listaPortali.get(i).setPolaPolozenia(polaPolozenia);
            System.out.println(polaPolozenia);
        }
    }


    private void rozpocznijGre() {

    }

    private void sprawdzRuchGracza() {

    }

    private void zakonczGre() {

    }

    public void kontynuujGre() {

    }
}
