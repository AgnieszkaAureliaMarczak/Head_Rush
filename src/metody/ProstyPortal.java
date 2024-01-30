package metody;

public class ProstyPortal {
    int[] polaPolozenia;
    int iloscTrafien;

    public void setPolaPolozenia(int[] polaPolozenia) {
        this.polaPolozenia = polaPolozenia;
    }

    public String sprawdz(String stringPole){
        int strzal = Integer.parseInt(stringPole);
        String wynik = "pudło";
        for (int pole : polaPolozenia) {
            if (strzal == pole){
                wynik = "trafiony";
                iloscTrafien++;
                break;
            }
        }
        if (iloscTrafien == polaPolozenia.length){
            wynik = "zatopiony";
        }
        System.out.println(wynik);
        return wynik;
    }
}
