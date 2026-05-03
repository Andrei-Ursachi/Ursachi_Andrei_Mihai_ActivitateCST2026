package singleton4.main;

import singleton4.clase.PrototipVehicul;

public class Main {
    public static void main(String[] args) {
        PrototipVehicul proto1 = PrototipVehicul.getInstance("genesis1", "fuziune protonica",
                3500, true, "anti-tanc");

        System.out.println(proto1);
    }
}
