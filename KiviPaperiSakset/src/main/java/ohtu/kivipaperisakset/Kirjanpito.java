package ohtu.kivipaperisakset;

// Kirjanpito pitää kirjaa ensimmäisen ja toisen pelaajan pisteistä sekä tasapelien määrästä.
public class Kirjanpito {

    private int ekanPisteet;
    private int tokanPisteet;
    private int tasapelit;

    public Kirjanpito() {
        this.ekanPisteet = 0;
        this.tokanPisteet = 0;
        this.tasapelit = 0;
    }

    public void kirjaaSiirto(String ekanSiirto, String tokanSiirto) {
        if (tasapeli(ekanSiirto, tokanSiirto)) {
            tasapelit++;
        } else if (ekaVoittaa(ekanSiirto, tokanSiirto)) {
            ekanPisteet++;
        } else {
            tokanPisteet++;
        }
    }

    // sisäinen metodi, jolla tarkastetaan tuliko tasapeli
    private static boolean tasapeli(String eka, String toka) {
        if (eka.equals(toka)) {
            return true;
        }

        return false;
    }

    // sisäinen metodi joka tarkastaa voittaako eka pelaaja tokan
    private static boolean ekaVoittaa(String eka, String toka) {
        if ("k".equals(eka) && "s".equals(toka)) {
            return true;
        } else if ("s".equals(eka) && "p".equals(toka)) {
            return true;
        } else if ("p".equals(eka) && "k".equals(toka)) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        String s = "Pelitilanne: " + ekanPisteet + " - " + tokanPisteet + "\n"
                + "Tasapelit: " + tasapelit;
        return s;
    }
}