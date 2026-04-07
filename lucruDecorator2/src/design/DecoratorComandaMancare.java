package design;

public abstract class DecoratorComandaMancare extends ComandaMancare{
    protected ComandaMancare comanda1;

    public DecoratorComandaMancare(ComandaMancare comanda1) {
        super();
        this.comanda1 = comanda1;
    }

    public String getProduseComanda(){
        return comanda1.getProduseComanda();
    }

    @Override
    public int getPret() {
        return comanda1.getPret();
    }
}
