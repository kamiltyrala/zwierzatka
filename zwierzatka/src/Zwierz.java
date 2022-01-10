public class Zwierz {

    protected String wlasciciel;
    protected String imie;
    protected String kolor;
    protected String dzwiek;
    protected String gatunek;
    protected String ulubione_jedzenie;

    public Zwierz(String Gatunek, String Wlasciciel, String Imie, String Kolor, String Dzwiek, String Ulubione_jedzenie) {

        gatunek = Gatunek;
        wlasciciel = Wlasciciel;
        imie = Imie;
        kolor = Kolor;
        dzwiek = Dzwiek;
        ulubione_jedzenie = Ulubione_jedzenie;

    }

    public void Wypisz() {

        System.out.println("Gatunek: "+gatunek);
        System.out.println("Własciciel: "+wlasciciel);
        System.out.println("Imię: "+imie);
        System.out.println("Kolor: "+kolor);
        System.out.println("Dzwiek: "+dzwiek);
        System.out.println("Ulubione jedzenie: "+ulubione_jedzenie);

    }

}
