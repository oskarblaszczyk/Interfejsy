package figury;

import java.util.List;

public interface Figura {
    double pole();

    double obwod();

    static Figura najwiekszePole(List<Figura> figury) {
        if (figury == null || figury.isEmpty()) {
            throw new IllegalArgumentException("lista nie moze byc null ani pusta");
        }
        Figura najwieksze = figury.get(0);
        for (Figura f : figury) {
            if (f.pole() > najwieksze.pole()) {
                najwieksze = f;
            }
        }
        return najwieksze;
    }

    static Figura najwiekszyObwod(List<Figura> figury) {
        if (figury == null || figury.isEmpty()) {
            throw new IllegalArgumentException("lista nie moze byc null ani pusta");
        }
        Figura wynik = figury.get(0);
        for (Figura f : figury) {
            if (f.obwod() > wynik.obwod()) {
                wynik = f;
            }
        }
        return wynik;
    }
}
