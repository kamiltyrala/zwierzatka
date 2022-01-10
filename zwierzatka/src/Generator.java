public class Generator {

    public static void main(String[] args) {

        Zwierz Kot = new Zwierz("Kot","Jaś","Puszek","Biały","Miałczy","Whiskas");
        Zwierz Pies = new Zwierz("Pies","Jaś","Reks","Rudy","Szczeka","Brit");
        Zwierz Papuga = new Zwierz("Papuga","Hanna","Ćwierkacz","Zielono-żółty","Papuguje","Słonecznik");
        Zwierz Golab = new Zwierz("Gołąb","Brak","Gołąb","Szary","Grucha","Chleb");
        Zwierz Ryba = new Zwierz("Złota rybka","Jaś","Brak","Pomarańczowy","Brak","Pokarm dla ryb");

                            System.out.println("");
        Kot.Wypisz();       System.out.println("");
        Pies.Wypisz();      System.out.println("");
        Papuga.Wypisz();    System.out.println("");
        Golab.Wypisz();     System.out.println("");
        Ryba.Wypisz();

    }

}
