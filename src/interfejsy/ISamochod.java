package interfejsy;

public interface ISamochod {

    // stałe, domyslnie public static final
    int LICZBA_KOL = 4;

    // abstrakcyjne
    void hamuj();
    void przyspiesz();

    // statyczne

    // default
    default int getLiczbaKol(){
        return LICZBA_KOL;
    }

    default int obliczMocDoDodania(int nitro){
        return 50 + dodajNitro(nitro);
    }

    // prywatne
    private int dodajNitro(int nitro){
        return nitro * 15;
    }
}
