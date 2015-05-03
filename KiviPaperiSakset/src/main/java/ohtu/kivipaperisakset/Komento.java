package ohtu.kivipaperisakset;

public class Komento {
    
    public Komento(Pelimoodi moodi)
    {
        PeliOhje();
        moodi.Pelaa(PeliOlioTehdas.uusiKirjanpito());
    }
    
    private void PeliOhje() {
        System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron "
                + "eli jonkun muun kuin k, p tai s");
    }
    
}
