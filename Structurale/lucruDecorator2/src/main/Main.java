package main;

import design.ComandaMancare;
import design.ComandaMixta;
import design.DecoratorBauturiAlcoolice;
import design.DecoratorTigari;

public class Main {
    public static void main(String[] args) {
        ComandaMancare comanda1 = new ComandaMixta();
        System.out.println(comanda1.getPret());
        System.out.println(comanda1.getProduseComanda());

        ComandaMancare comanda2 =new DecoratorBauturiAlcoolice(comanda1, 2);
        System.out.println(comanda2.getPret());
        System.out.println(comanda2.getProduseComanda());

        ComandaMancare comanda3 =new DecoratorTigari(comanda1, 6);
        System.out.println(comanda3.getPret());
        System.out.println(comanda3.getProduseComanda());
    }
}
