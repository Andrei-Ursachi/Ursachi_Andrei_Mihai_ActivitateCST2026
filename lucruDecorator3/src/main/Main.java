package main;

import design.CumparareInitiala;
import design.CumparareMasina;
import design.DecoratorMotorizare;
import design.DecoratorVopsea;

public class Main {
    public static void main(String[] args) {
        CumparareMasina masina1 = new CumparareInitiala();
        System.out.println(masina1.getModelMasina());
        System.out.println(masina1.getNrDotari());

        CumparareMasina masina2 = new DecoratorVopsea(masina1, "visinie");
        System.out.println(masina2.getModelMasina());
        System.out.println(masina2.getNrDotari());

        CumparareMasina masina3 = new DecoratorMotorizare(masina2, "Extreme");
        System.out.println(masina3.getModelMasina());
        System.out.println(masina3.getNrDotari());
    }
}
