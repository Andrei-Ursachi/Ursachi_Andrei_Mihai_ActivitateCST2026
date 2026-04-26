package main;

import design.Facade;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        List<Integer> lista1 = new ArrayList<>();
        lista1.add(10);
        lista1.add(5);
        lista1.add(2);

        List<Integer> lista2 = new ArrayList<>();
        lista1.add(2);
        lista1.add(7);
        lista1.add(3);
        facade.tratarePacient("Ion", 29, 6, "Ioana", 17,
                "chirurg", "happy teeth", lista1, lista2, 4);
    }
}
