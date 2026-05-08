package design;

public class ColeteMici implements IColet{
    private float greutate;
    private int taxa;
    private boolean fragil;
    private String destinatie;

    //generate constructor
    public ColeteMici(float greutate, int taxa, boolean fragil,String destinatie) {
        this.greutate = greutate;
        this.taxa = taxa;
        this.fragil = fragil;
        this.destinatie = destinatie;
    }

    @Override
    public void livrareColet() {
        System.out.println("Pachet mic cu destinatia "+destinatie+" a fost livrat.");
    }

    @Override
    public void rezervareLivrare() {
        System.out.println("Pachet mic cu destinatia "+destinatie+" este planificat pt livrare");
    }
}
