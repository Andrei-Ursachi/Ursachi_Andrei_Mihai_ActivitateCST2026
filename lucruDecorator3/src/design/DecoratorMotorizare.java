package design;

public class DecoratorMotorizare extends DecoratorCumparareMasina {

    private String tipMotorizare;
    public DecoratorMotorizare(CumparareMasina masina1,String tipMotorizare) {
        super(masina1);
        this.tipMotorizare = tipMotorizare;
    }

    @Override
    public String getModelMasina() {
        return super.getModelMasina() + " cu motorizarea " + this.tipMotorizare;
    }

    @Override
    public int getNrDotari() {
        return super.getNrDotari();
    }
}
