package design;

public abstract class DecoratorComandaMancare extends ComandaMancare{
    protected ComandaMancare comanda1;

    public DecoratorComandaMancare(ComandaMancare comanda1) {
        super();
        this.comanda1 = comanda1;
    }

    String getProduseComanda(){
        return comanda1.getProduseComanda();
    }

    @Override
    int getPret() {
        return comanda1.getPret();
    }
}
