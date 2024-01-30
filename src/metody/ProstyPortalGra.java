package metody;

import java.util.Random;
import java.util.Scanner;

public class ProstyPortalGra {
    private ProstyPortal prostyPortal;
    private Scanner scanner = new Scanner(System.in);
    private int iloscRuchow;

    public ProstyPortalGra() {
        this.prostyPortal = new ProstyPortal();
    }

    public void graj() {
        okreslPolozeniePortalu();
        strzelaj();
    }

    private void okreslPolozeniePortalu() {
        int[] polozeniePortalu = new int[3];
        Random random = new Random();
        int poczatekPortalu = random.nextInt(5);
        for (int i = 0; i < polozeniePortalu.length; i++) {
            polozeniePortalu[i] = poczatekPortalu;
            poczatekPortalu++;
        }
        prostyPortal.setPolaPolozenia(polozeniePortalu);
    }

    private void strzelaj(){
        String wynik;
        do {
            String strzal = podajPole();
            wynik = prostyPortal.sprawdz(strzal);
            iloscRuchow++;
        } while (!wynik.equals("zatopiony"));
        System.out.println("Ilość ruchów: " + iloscRuchow);
    }

    private String podajPole() {
        System.out.print("Podaj pole: ");
        return scanner.nextLine();
    }
}
