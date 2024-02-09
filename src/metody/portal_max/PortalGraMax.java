package metody.portal_max;

import java.util.ArrayList;
import java.util.List;

public class PortalGraMax {
    private PomocnikGry pomocnik;
    private List<Portal> listaPortali = new ArrayList<>();
    private int iloscRuchow = 0;
    private int iloscPortali = 3;

    public static void main(String[] args) {
        PortalGraMax portalGraMax = new PortalGraMax();
    }

    private void przygotujGre() {
        utworzPortaleIWpiszDoTablicy();
        nadajNazwyPortali();

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



    private void rozpocznijGre() {

    }

    private void sprawdzRuchGracza() {

    }

    private void zakonczGre() {

    }

    private PomocnikGry utworzPomocnikaGry() {
        return new PomocnikGry();
    }

    public void umiescPortaleNaPlanszy() {

    }

   /* public String sprawdzWszystkiePortale(String ruch) {
        String wynik = "pudlo";
        int indeks = polaPolozenia.indexOf(ruch);
        if (indeks >= 0) {
            polaPolozenia.remove(indeks);
            if (polaPolozenia.isEmpty()){
                wynik = "zatopiony";
            } else {
                wynik = "trafiony";
            }
        }
        return wynik;
    }*/

    public void kontynuujGre() {

    }
}
