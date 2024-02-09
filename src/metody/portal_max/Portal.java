package metody.portal_max;

import java.util.ArrayList;

public class Portal {
    private ArrayList<String> polaPolozenia;
    private String nazwa;

    public Portal(ArrayList<String> polaPolozenia, String nazwa) {
        this.polaPolozenia = polaPolozenia;
        this.nazwa = nazwa;
    }

    public void setPolaPolozenia(ArrayList<String> polaPolozenia) {
        this.polaPolozenia = polaPolozenia;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
