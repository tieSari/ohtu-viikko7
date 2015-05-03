package ohtu.kivipaperisakset;

public class YksinPeli extends Pelimoodi {
    Tekoaly tekoaly = PeliOlioTehdas.uusiTekoaly();

    @Override
    String TokanSiirto(String ekanSiirto) {
        String tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        return tokanSiirto;
    }
}
