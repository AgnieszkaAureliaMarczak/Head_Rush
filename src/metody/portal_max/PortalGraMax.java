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
        portalGraMax.graj();
    }

    private void graj() {
        przygotujGre();
        rozpocznijGre();
        zakonczGre();
    }


    private void przygotujGre() {
        utworzPortaleIWpiszDoTablicy();
        nadajNazwyPortali();
        rozmiescPortaleNaPlanszy();
        wyswietlKomunikaty();
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

    private void wyswietlKomunikaty() {
        System.out.println("Twoim celem jest zatopienie trzech portali");
        System.out.println("onet.pl, wp.pl, go2.pl");
        System.out.println("Postaraj sie je zatopić w jak najmniejszej ilości ruchów");
    }


    private void rozpocznijGre() {
        while (!listaPortali.isEmpty()) {
            String ruch = pomocnik.pobierzDaneWejsciowe("Podaj pole: ");
            sprawdzRuchGracza(ruch);
        }
    }

    private void sprawdzRuchGracza(String ruch) {
        iloscRuchow++;
        String wynik = "pudło";
        int strzal = Integer.parseInt(ruch);
        for (Portal portal : listaPortali) {


            // portal.sprawdz();
            //if zatopiony >> usunac portal
        }
        System.out.println(wynik);
    }

    private void zakonczGre() {
        System.out.println("Koniec gry");
        if (iloscRuchow < 15) {
            System.out.println("Gratulacje! Zatopiłeś wszystkie portale w " + iloscRuchow + " ruchów.");
        } else {
            System.out.println("Słabo ci poszło.");
        }
    }
}
