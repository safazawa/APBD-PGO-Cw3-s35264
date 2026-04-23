public class Main {
    public static void main(String[] args) {

        //Produkty w menu//
        ProduktMenu p1 = new ProduktMenu("K01", "Espresso", 11.00, "Kawa");
        ProduktMenu p2 = new ProduktMenu("K02", "Matcha labubu dubai chocolate latte", 1420.00, "Kawa");
        ProduktMenu p3 = new ProduktMenu("C01", "Sernik nowojorski", 22.00, "Ciasto" );

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("\nLiczba produktów: " + ProduktMenu.getLiczbaProduktow());

        ProduktMenu p4 = new ProduktMenu("K01", "Espresso", 11.00, "Kawa");
        System.out.println("p1 equals p4 (ten sam kod): " + p1.equals(p4));
        System.out.println("p1 equals p2 (różny kod): " + p1.equals(p2));

        //Klienci kawiarni//
        KlientKawiarni k1 = new KlientKawiarni(1, "Wojtek", "Gola", "certyfikowanyb6@hotmail.com");
        KlientKawiarni k2 = new KlientKawiarni(2, "Witold", "Gombrowicz", "lydkilydki@gmail.pl");

        System.out.println(k1);
        System.out.println(k2);

        System.out.println("\nPełne dane: " + k1.getPelneDane());

        KlientKawiarni k3 = new KlientKawiarni(1, "Wojtek", "Gola", "certyfikowanyb6@hotmail.com");
        System.out.println("k1 equals k3 (ten sam id): " + k1.equals(k3));
        System.out.println("k1 equals k2 (różny id i email): " + k1.equals(k2));

        KlientKawiarni k4 = new KlientKawiarni(100, "kewin", "Spejsi", "kosmos@gmail.com");
        System.out.println("k1 equals k4 (ten sam mail): " + k1.equals(k4));

        //Zamowienia//
        Zamowienie z1 = new Zamowienie(k1);
        z1.dodajProdukt(p1);
        z1.dodajProdukt(p2);
        z1.dodajProdukt(p3);

        System.out.println(z1);

        z1.oznaczJakoOplacone();
        System.out.println("\nPo opłaceniu: ");
        System.out.println(z1);

        Zamowienie z2 = new Zamowienie(k2);
        z2.dodajProdukt(p2);
        z2.dodajProdukt(p2);

        System.out.println("\n" + z2);

        System.out.println("\nNastępny numer zamówienia będzie: " + Zamowienie.pobierzKolejnyNumer());
    }
}