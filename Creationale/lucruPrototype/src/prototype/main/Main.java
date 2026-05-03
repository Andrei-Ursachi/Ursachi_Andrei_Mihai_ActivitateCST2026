package prototype.main;

import prototype.clase.Prototype;
import prototype.clase.Vizita;

public class Main {
    public static void main(String[] args) {
        Prototype vizita = new Vizita("Mihai", 2, 18);
        Prototype vizita2 = vizita.copiaza();
        ((Vizita)vizita2).setNrPersoane(55);

        System.out.println(vizita.toString());
        System.out.println(vizita2.toString());
    }
}
