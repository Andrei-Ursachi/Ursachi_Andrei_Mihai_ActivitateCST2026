package design;

public class ColeteMari implements IColet{
    private float greutate;
    private int taxa;
    private boolean necesitaPalet;
    private String destinatie;

    //generate constructor
    public ColeteMari(float greutate, int taxa, boolean necesitaPalet,String destinatie) {
        this.greutate = greutate;
        this.taxa = taxa;
        this.necesitaPalet = necesitaPalet;
        this.destinatie = destinatie;
    }

    @Override
    public void livrareColet() {
        System.out.println("Coletul mare cu destinatia "+destinatie+" a fost livrat.");
    }

    @Override
    public void rezervareLivrare() {
        System.out.println("Coletul mare cu destinatia "+destinatie+" este planificat pt livrare");
    }
}
