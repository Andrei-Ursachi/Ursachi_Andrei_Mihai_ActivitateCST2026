package design;

public class DecoratorTigari extends DecoratorComandaMancare{

    @Override
    String getProduseComanda() {
        return super.getProduseComanda() + " pachet malboro";
    }

    @Override
    int getPret() {
        return super.getPret() + 30;
    }

    public DecoratorTigari(ComandaMancare comanda1) {
        super(comanda1);
    }
}
