package builder.main;
import builder.clase.Comanda;
import builder.clase.abordareNoua.BuilderAbstract;
import builder.clase.abordareNoua.ComandaBuilder;

public class Main {
    public static void main(String[] args) {
        Comanda comanda1 = new Comanda(true, true, "Exotica", "pui", 500);
        System.out.println(comanda1);
        Comanda comanda2 = new Comanda();
        comanda2.setCuCartofi(true);
        comanda2.setCuSos(false);

        System.out.println(comanda2.toString());

        BuilderAbstract builder = new ComandaBuilder();
        Comanda comanda3 = builder.setGreutate(200).setTipCarne("bizon").build();
        Comanda comanda4 = new ComandaBuilder().setTipCarne("berbec").build();

        System.out.println(comanda3);
        System.out.println(comanda4);
    }

}
