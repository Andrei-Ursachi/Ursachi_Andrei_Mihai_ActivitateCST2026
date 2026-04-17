package design;


public class DecoratorVopsea extends DecoratorCumparareMasina {
    private String culoare;

    public DecoratorVopsea(CumparareMasina masina1, String nuanta) {
        super(masina1);
        this.culoare = nuanta;
    }

    @Override
    public String getModelMasina() {
        return super.getModelMasina() + " cu nuanta " +this.culoare;
    }

    @Override
    public int getNrDotari() {
        return super.getNrDotari();
    }
}
