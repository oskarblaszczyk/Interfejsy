package figury;

public class Kwadrat implements Figura{
    private double bok;

    public Kwadrat(double bok) {
        this.bok = bok;
    }

    @Override
    public double pole() {
        return bok * bok;
    }

    @Override
    public double obwod() {
        return bok * 4;
    }
}
