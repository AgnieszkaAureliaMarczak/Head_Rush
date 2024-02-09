package metody.portal_max;

import java.util.ArrayList;
import java.util.List;

public class PortalGraMax {
    private PomocnikGry pomocnik;
    private List<Portal> listaPortali = new ArrayList<>();
    private int iloscRuchow;

    public static void main(String[] args) {
        PortalGraMax portalGraMax = new PortalGraMax();
    }

    private void przygotujGre(){

    }

    private void rozpocznijGre(){

    }

    private void sprawdzRuchGracza(){

    }

    private void zakonczGre(){

    }

    private PomocnikGry utworzPomocnikaGry(){
        return new PomocnikGry();
    }



    public void utworzPortale() {
        /*int[] polozeniePortalu = new int[3];
        Random random = new Random();
        int poczatekPortalu = random.nextInt(5);
        for (int i = 0; i < polozeniePortalu.length; i++) {
            polozeniePortalu[i] = poczatekPortalu;
            poczatekPortalu++;
        }
        prostyPortal.setPolaPolozenia(polozeniePortalu);*/
    }

    public void nadajNazwy(){

    }

    public void umiescPortaleNaPlanszy(){

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

    public void kontynuujGre(){

    }
}
