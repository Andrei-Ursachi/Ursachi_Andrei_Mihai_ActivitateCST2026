package singleton3.main;

import singleton3.clase.ProdusMarketing;

public class Main {
    public static void main(String[] args) {
        ProdusMarketing produs1 = ProdusMarketing.getInstance("Steag", 15, true);
        System.out.println(produs1);
    }
}
