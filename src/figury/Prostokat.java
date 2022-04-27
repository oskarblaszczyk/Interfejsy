package figury;

public class Prostokat implements Figura{
    private double dlugosc;
    private double szerokosc;

    public Prostokat(double dlugosc, double szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }


    @Override
    public double pole() {
        return dlugosc * szerokosc;
    }

    @Override
    public double obwod() {
        return (2 * dlugosc) + (2 * szerokosc);
    }
}
