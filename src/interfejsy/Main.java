package interfejsy;

public class Main {

    public static void main(String[] args) {
        Samochod s1 = new Samochod("a", "b", 500);

        System.out.println(s1.getLiczbaKol());
        System.out.println(Samochod.LICZBA_KOL);

        System.out.println(s1.getMoc());

        s1.dodajMoc(10);
        
        System.out.println(s1.getMoc());
    }
}
