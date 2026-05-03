package design;

public class Oferta implements IOferta{
    private int pretOferta;
    private int nrBeneficii;
    private String numeOferta;

    private Client client;

    //generate constructor
    public Oferta(int pretOferta, int nrBeneficii, String numeOferta, Client client) {
        this.pretOferta = pretOferta;
        this.nrBeneficii = nrBeneficii;
        this.numeOferta = numeOferta;
        this.client = client;
    }

    //generate getters
    public int getPretOferta() {
        return pretOferta;
    }

    public Client getClient() {
        return client;
    }

    public int getNrBeneficii() {
        return nrBeneficii;
    }

    public String getNumeOferta() {
        return numeOferta;
    }

    @Override
    public void rezervaOferta() {
        System.out.println("S-a acceptat oferta!");
    }
}
