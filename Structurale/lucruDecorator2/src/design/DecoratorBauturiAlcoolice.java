package design;

//mosteneste decoratorul clasei principale
public class DecoratorBauturiAlcoolice extends DecoratorComandaMancare {
    //un atribut privat
    private int nrSticle;

    //constructor generat cu eroarea de dupa mostenire + adaugat noul atribut
    public DecoratorBauturiAlcoolice(ComandaMancare comanda1, int nrSticle) {
        super(comanda1);
        this.nrSticle = nrSticle;
    }

    //metode override scrise cu generate la care adaug valori pt atributul adaugat aici
    @Override
    public String getProduseComanda() {
        return super.getProduseComanda() + " rom" + this.nrSticle;
    }

    @Override
    public int getPret() {
        return super.getPret() + 70;
    }
}
