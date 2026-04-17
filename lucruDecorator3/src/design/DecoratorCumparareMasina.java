package design;


public abstract class DecoratorCumparareMasina extends CumparareMasina{
    protected CumparareMasina masina1;

    public DecoratorCumparareMasina(CumparareMasina masina1) {
        super();
        this.masina1 = masina1;
    }

    @Override
    public String getModelMasina() {
        return masina1.getModelMasina();
    }

    @Override
    public int getNrDotari() {
        return masina1.getNrDotari();
    }
}
