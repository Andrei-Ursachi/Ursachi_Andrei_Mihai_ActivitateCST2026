package prototype2.main;

import prototype2.clase.ContClient;
import prototype2.clase.InterfataContClient;

public class Main {
    public static void main(String[] args) {
        InterfataContClient cont2 = new ContClient("User", "altemail@mail.com", 15);
        System.out.println(cont2);
        ((ContClient)cont2).setNrCaractereParola(200);
        InterfataContClient cont3 = cont2.copy();
        System.out.println(cont3);
    }
}
