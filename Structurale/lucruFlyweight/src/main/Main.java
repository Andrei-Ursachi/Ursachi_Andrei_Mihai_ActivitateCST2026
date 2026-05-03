package main;

import design.ClasaFlyweight;
import design.Optionale;
import design.PachetVacanta;

public class Main {
    public static void main(String[] args) {
        Optionale optional = new Optionale(true, false, false, 2);
        Optionale optional2 = new Optionale(false, false, false, 6);
        Optionale optional3 = new Optionale(true, true, true, 10);

        ClasaFlyweight classFlyweight = new ClasaFlyweight();
        System.out.println("--------pachet2-------------");
        PachetVacanta pachetVacanta1 = classFlyweight.getPachet(1, "Soare", "Grecia", "Masina");
        pachetVacanta1.descriere(optional);
        pachetVacanta1.descriere(optional2);
        pachetVacanta1.descriere(optional3);

        System.out.println("--------pachet2-------------");
        PachetVacanta pachetVacanta2 = classFlyweight.getPachet(1, "hotel", "asdasd", "asdas");
        pachetVacanta1.descriere(optional);
        pachetVacanta1.descriere(optional2);
        pachetVacanta1.descriere(optional3);

        System.out.println("----------pachet 3-----------");
        PachetVacanta pachetVacanta3 = classFlyweight.getPachet(5, "test", "Jamaica", "Avion");
        pachetVacanta3.descriere(optional);
        pachetVacanta3.descriere(optional2);
        pachetVacanta3.descriere(optional3);
    }
}
