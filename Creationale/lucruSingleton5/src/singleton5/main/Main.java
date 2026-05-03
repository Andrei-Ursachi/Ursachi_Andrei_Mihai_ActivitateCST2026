package singleton5.main;

import singleton5.clase.Buletin;

public class Main {
    public static void main(String[] args) {
        Buletin buletin1 = Buletin.getInstance(202321323, "Ion", "RK");
        System.out.println(buletin1);
    }
}
