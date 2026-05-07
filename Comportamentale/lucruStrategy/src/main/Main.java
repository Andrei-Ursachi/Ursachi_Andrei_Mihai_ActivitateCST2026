package main;

import design.Bicicleta;
import design.Masina;
import design.Motocicleta;
import design.Persoana;

public class Main {
    public static void main(String[] args) {
        Persoana persoana = new Persoana("Ion", 27, "Atletic", new Motocicleta());
        Persoana persoana2 = new Persoana("Vasile", 67, "Nu buna", new Masina());

        persoana.deplasare(2.5);
        persoana2.deplasare(4.1);

        persoana2.setModTransport(new Bicicleta());
        persoana2.deplasare(7.5);
    }
}
