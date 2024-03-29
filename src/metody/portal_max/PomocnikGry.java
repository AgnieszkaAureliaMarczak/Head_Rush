package metody.portal_max;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PomocnikGry {
    private static final String alfabet = "abcdefg";
    private int dlugoscPlanszy = 7;
    private int wielkoscPlanszy = 49;
    private int[] plansza = new int[wielkoscPlanszy];
    private int iloscPortali = 0;

    public String pobierzDaneWejsciowe(String komunikat) {
        String daneWejsciowe = null;
        System.out.print(komunikat + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            daneWejsciowe = is.readLine();
            if (daneWejsciowe.isEmpty()) {
                return null;
            }
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return daneWejsciowe.toLowerCase();
    }

    public ArrayList<String> rozmiescPortal(int wielkoscPortalu) {
        ArrayList<String> zajetePola = new ArrayList<>();
        String[] wspolrzedneLnc = new String[wielkoscPortalu];
        String pomoc;
        int[] wspolrzedne = new int[wielkoscPortalu];
        int prob = 0;
        boolean powodzenie = false;
        int polozenie;

        iloscPortali++;
        int inkr = 1;
        if ((iloscPortali % 2) == 1) {
            inkr = dlugoscPlanszy;
        }

        while (!powodzenie & prob++ < 200) {
            polozenie = (int) (Math.random() * wielkoscPlanszy);
           // System.out.print(" sprawdz " + polozenie);
            int x = 0;
            powodzenie = true;
            while (powodzenie && x < wielkoscPortalu) {
                if (plansza[polozenie] == 0) {
                    wspolrzedne[x++] = polozenie;
                    polozenie += inkr;
                    if (polozenie >= wielkoscPlanszy) {
                        powodzenie = false;
                    }
                    if (polozenie % dlugoscPlanszy == 0) {
                        powodzenie = false;
                    }
                } else {
                   // System.out.print(" już zajete ");
                    powodzenie = false;
                }
            }
        }

        int x = 0;
        int wiersz;
        int kolumna;
       // System.out.println("\n");
        while (x < wielkoscPortalu){
          plansza[wspolrzedne[x]] = 1;
          wiersz = wspolrzedne[x] / dlugoscPlanszy;
          kolumna = wspolrzedne[x] % dlugoscPlanszy;
          pomoc = String.valueOf(alfabet.charAt(kolumna));
          zajetePola.add(pomoc.concat(Integer.toString(wiersz)));
          x++;
          //  System.out.print(" współrzędne " + x + " = " + zajetePola.get(x-1));
        }
       // System.out.println("\n");
        return zajetePola;
    }
}
