/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.kivipaperisakset;

/**
 *
 * @author sariraut
 */
public class PeliOlioTehdas {

    private PeliOlioTehdas() {
    }

    public static KaksinPeli uusiKaksinPeli() {
        return new KaksinPeli();
    }

    public static YksinPeli uusiYksinPeli() {
        return new YksinPeli();
    }

    public static YksinPeliTurbo uusiYksinPeliTurbo() {
        return new YksinPeliTurbo();
    }

    public static Kirjanpito uusiKirjanpito() {
        return new Kirjanpito();
    }

    public static Tekoaly uusiTekoaly() {
        return new Tekoaly();
    }
    
     public static TekoalyTurbo uusiTekoalyTurbo(int muistinkoko) {
        return new TekoalyTurbo(muistinkoko);
    }

    public static Komento uusiKomento(Pelimoodi moodi) {
        return new Komento(moodi);
    }

}
