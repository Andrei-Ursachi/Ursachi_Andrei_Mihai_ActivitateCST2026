package singleton2.main;

import singleton2.clase.Scrisoare;

public class Main {
    public static void main(String[] args) {
        Scrisoare scrisoare1 = Scrisoare.getInstance("Citatie primarie",
                2, "Vasile", "Ionica");
        System.out.println(scrisoare1);
    }
}
