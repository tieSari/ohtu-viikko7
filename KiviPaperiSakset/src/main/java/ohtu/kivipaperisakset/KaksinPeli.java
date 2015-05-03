package ohtu.kivipaperisakset;

public class KaksinPeli extends Pelimoodi {


    @Override
    String TokanSiirto(String ekanSiirto) {
        System.out.print("Toisen pelaajan siirto: ");
        return scanner.nextLine();
    }

}
