package design;

public class DecoratorBauturiAlcoolice extends DecoratorComandaMancare {
    private int nrSticle;

    public DecoratorBauturiAlcoolice(ComandaMancare comanda1, int nrSticle) {
        super(comanda1);
        this.nrSticle = nrSticle;
    }

    @Override
    String getProduseComanda() {
        return super.getProduseComanda() + " rom" + this.nrSticle;
    }

    @Override
    int getPret() {
        return super.getPret() + 70;
    }
}
