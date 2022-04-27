package interfejsy;

public class Samochod implements ISamochod {
    private String marka;
    private String model;
    private int moc;

    public Samochod(String marka, String model, int moc) {
        this.marka = marka;
        this.model = model;
        this.moc = moc;
    }

    @Override
    public void hamuj() {
        System.out.println("hamujesz");
    }

    @Override
    public void przyspiesz() {
        System.out.println("przyspieaszasz");
    }

    public void dodajMoc(int ilosc){
        moc += obliczMocDoDodania(ilosc);
    }


    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMoc() {
        return moc;
    }

    public void setMoc(int moc) {
        this.moc = moc;
    }


}
