package metody.portal_max;

import java.util.ArrayList;

public class Portal {
    private ArrayList<String> polaPolozenia;
    private String nazwa;

    public void setPolaPolozenia(ArrayList<String> polaPolozenia) {
        this.polaPolozenia = polaPolozenia;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String sprawdz(String ruch){
        String wynik = "pudło";
        int indeks = polaPolozenia.indexOf(ruch);
        if (indeks >= 0){
            polaPolozenia.remove(indeks);
            if (polaPolozenia.isEmpty()){
                wynik = "zatopiony";
                System.out.println("Zatopiłeś portal o nazwie " + nazwa + ".");
            } else {
                wynik = "trafiony";
            }
        }
        return wynik;
    }
}
