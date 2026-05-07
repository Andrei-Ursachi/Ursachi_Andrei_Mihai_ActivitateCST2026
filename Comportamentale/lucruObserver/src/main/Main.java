package main;

import design.Admin;
import design.IObserver;
import design.ISistemAlerta;
import design.Sistem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IObserver admin = new Admin("Ion", "IT", 2);
        IObserver admin2 = new Admin("Vasile", "IT", 4);
        IObserver admin3 = new Admin("Gica", "IT", 5);

        List<IObserver> listaAdmini = new ArrayList<>();
        listaAdmini.add(admin);
        listaAdmini.add(admin2);
        listaAdmini.add(admin3);

        ISistemAlerta sistemAlerta = new Sistem("Salarii",listaAdmini);
        sistemAlerta.adaugaAdmin(new Admin("Andrei", "HR", 1));
        sistemAlerta.adaugaAdmin(new Admin("Elena", "Logistica", 1));

        ((Sistem)sistemAlerta).alertaIncidentMajor();
        sistemAlerta.stergeAdmin(admin2);
        System.out.println("-----------------------");

        ((Sistem)sistemAlerta).alertaBreach();
    }
}
