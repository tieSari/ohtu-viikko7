package ohtu.kivipaperisakset;

import java.util.Scanner;

public class Paaohjelma {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Komento komento;

        while (true) {
           TulostaValikko();
           
            String vastaus = scanner.nextLine();
            if (vastaus.endsWith("a")) {
                komento = PeliOlioTehdas.uusiKomento(PeliOlioTehdas.uusiKaksinPeli());

            } else if (vastaus.endsWith("b")) {
                komento = PeliOlioTehdas.uusiKomento(PeliOlioTehdas.uusiYksinPeli());

            } else if (vastaus.endsWith("c")) {
                komento = PeliOlioTehdas.uusiKomento(PeliOlioTehdas.uusiYksinPeliTurbo());

            } else {
                break;
            }

        }
    }

    private static void TulostaValikko() {
        System.out.println(
                "\nValitse pelataanko"
                + "\n (a) ihmistä vastaan "
                + "\n (b) tekoälyä vastaan"
                + "\n (c) parannettua tekoälyä vastaan"
                + "\nmuilla valinnoilla lopetetaan");
    }

}
