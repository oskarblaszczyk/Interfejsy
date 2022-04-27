package piekarnik;

public class Piekarnik implements PieczenieCiast, PieczenieMies {
    private int czas;
    private int temperatura;


    @Override
    public void pieczChleb() {
        czas = 120;
        temperatura = 200;
    }

    @Override
    public void pieczCiasto() {
        czas = 100;
        temperatura = 180;

    }

    @Override
    public void pieczWolowina() {
        czas = 130;
        temperatura = 150;
    }

    @Override
    public void pieczKurczak() {
        czas = 150;
        temperatura = 220;
    }
}
