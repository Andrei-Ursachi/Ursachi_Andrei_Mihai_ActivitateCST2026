package main;

import design.IAlertaSpital;
import design.IObserver;
import design.InformareSpital;
import design.Pacient;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IObserver pacient1 = new Pacient("Ionel", 29, true);
        IObserver pacient2 = new Pacient("Gica", 33, true);
        IObserver pacient3 = new Pacient("Vasile", 21, true);
        IObserver pacient4 = new Pacient("Mincu", 55, true);

        List<IObserver> listaPacienti = new ArrayList<>();
        listaPacienti.add(pacient1);
        listaPacienti.add(pacient2);
        listaPacienti.add(pacient3);
        listaPacienti.add(pacient4);

        IAlertaSpital sistemAlertare = new InformareSpital("SOS info", listaPacienti);
        sistemAlertare.adaugaPacient(new Pacient("Gina", 31, true));

        sistemAlertare.stergerePacient(pacient4);
        ((InformareSpital)sistemAlertare).alertaPandemie();
        System.out.println("------------------------");
        sistemAlertare.adaugaPacient(pacient4);
        ((InformareSpital)sistemAlertare).alertaVirusMortal();
    }
}
