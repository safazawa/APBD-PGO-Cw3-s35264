public class Main {
    public static void main(String[] args) {

        ProduktMenu p1 = new ProduktMenu("K01", "Espresso", 11.00, "Kawa");
        ProduktMenu p2 = new ProduktMenu("K02", "Matcha labubu dubai chocolate latte", 1420.00, "Kawa");
        ProduktMenu p3 = new ProduktMenu("C01", "Sernik nowojorski", 22.00, "Ciasto" );

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("Liczba produktów: " + ProduktMenu.getLiczbaProduktow());

        ProduktMenu p4 = new ProduktMenu("K01", "Espresso", 11.00, "Kawa");
        System.out.println("p1 equals p4 (ten sam kod): " + p1.equals(p4));
        System.out.println("p1 equals p2 (różny kod): " + p1.equals(p2));
    }
}