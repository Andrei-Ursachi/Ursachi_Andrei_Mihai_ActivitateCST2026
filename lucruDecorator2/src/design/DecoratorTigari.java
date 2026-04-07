package design;

public class DecoratorTigari extends DecoratorComandaMancare{
    private int nrPachete;

    public DecoratorTigari(ComandaMancare comanda1, int nrPachete) {
        super(comanda1);
        this.nrPachete = nrPachete;
    }

    @Override
    public String getProduseComanda() {
        return super.getProduseComanda() + " pachet malboro" + this.nrPachete;
    }

    @Override
    public int getPret() {
        return super.getPret() * this.nrPachete;
    }

    public DecoratorTigari(ComandaMancare comanda1) {
        super(comanda1);
    }
}
