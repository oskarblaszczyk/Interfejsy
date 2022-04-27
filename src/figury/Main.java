package figury;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

// stworz Kwadrat (bok), Kolo (promien), Prostokat (dl,szer)
// - znajdz figure z najwieskszym polem
// - znajdz figure z najwiekszym obwodem
// - zwroc liste wszystkich figur które maja pole wieksze niz 30cm^2
// - zwróc liste koł ktore maja promien mniejszy niz 7cm

        Kolo k1 = new Kolo(5);
        System.out.println(Figura.najwiekszePole(Arrays.asList(k1)));
        System.out.println(Figura.najwiekszePole(Arrays.asList(k1)));

        // Stworz kalkulator oparty o interfejs Dzialanie w ktorym mamy jedna metode licz(double d1, double d2)

        /*
         * Stworz hieararchie dziedziczenia interfejsow tak aby mialy biznesowy sens. Stworz sensowne biznesowe klasy ktore moga je implementowac
         * (niekoniecznie kazda klasa kazdy interfejs). Niech interefejsy maja rozne metody statyczne, defaultowe, abstrakcyjne, tak aby calosc
         * tworzyła wspolna sensowna całosc :) gl
         */

    }
}
