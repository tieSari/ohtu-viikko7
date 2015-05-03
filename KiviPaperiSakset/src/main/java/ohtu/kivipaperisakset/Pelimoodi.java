package ohtu.kivipaperisakset;

import java.util.Scanner;

abstract class Pelimoodi {

    protected static final Scanner scanner = new Scanner(System.in);

    abstract String TokanSiirto(String ekanSiirto);

    protected void KirjaaSiirto(Kirjanpito kirjanpito, String ekanSiirto, String tokanSiirto) {
        kirjanpito.kirjaaSiirto(ekanSiirto, tokanSiirto);
        System.out.println(kirjanpito);
        System.out.println();
    }

    protected void Tulos(Kirjanpito kirjanpito) {
        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(kirjanpito);
    }

    protected String EkanSiirto() {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        return scanner.nextLine();
    }

    protected void Pelaa(Kirjanpito kirjanpito) {

        String ekanSiirto = EkanSiirto();
        String tokanSiirto = TokanSiirto(ekanSiirto);

        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
            KirjaaSiirto(kirjanpito, ekanSiirto, tokanSiirto);
            ekanSiirto = EkanSiirto();
            tokanSiirto = TokanSiirto(ekanSiirto);
        }

        Tulos(kirjanpito);
    }

    protected boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }

}
