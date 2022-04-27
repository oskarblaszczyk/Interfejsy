package misie;

public class Main {
    public static void main(String[] args) {

        //Stwórz hierachie dziedzczenia interfejsow. Interfejs Mis i Zjadacz Miodku niech maja jakies metody, moze pole.
        //Interfejs GrubyMis dziedziczy po tych dwoch
        //interfejsach, a klasa KubusPuchatek implementuje interfejs GrubyMisio :) przetestujmy dzialanie metod w mainie

        KubusPuchatek kubus = new KubusPuchatek();

        kubus.jedzMiodek();
        kubus.spij();

    }
}
