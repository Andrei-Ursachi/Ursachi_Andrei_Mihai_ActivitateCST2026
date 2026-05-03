package main;

import design.*;

public class Main {
    public static void main(String[] args) {
        //creez un obiect din "proiectul" initial
        IColet colet = new Colet("Franta", 20, true);
        colet.livrareColet();

        //creez un obiect din al 2lea proiect
        IMetodaLivrare metoda = new MetodaLivrare("auto", 35, "Ion");
        metoda.procesLivrare();

        //iar aici creez un nou obiect adaptat, dar in spate se arata metoda de transport din MetodaLivrare
        System.out.println("--------------Apel dupa adaptare----------");
        IColet coletAdapter = new ColetLivrareAdapter(metoda);
        coletAdapter.livrareColet();
    }
}
