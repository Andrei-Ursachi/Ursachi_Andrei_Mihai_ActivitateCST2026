package design;

public class Cazare implements InterfaceCazare{
    //atribute
    private String numeHotel;
    private float pret;
    private int nrZileCazare;

    //generate constr
    public Cazare(String numeHotel, float pret, int nrZileCazare) {
        this.numeHotel = numeHotel;
        this.pret = pret;
        this.nrZileCazare = nrZileCazare;
    }

    //generate getter
    public String getNumeHotel() {
        return numeHotel;
    }

    //generate toString
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cazare{");
        sb.append("numeHotel='").append(numeHotel).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", nrZileCazare=").append(nrZileCazare);
        sb.append('}');
        return sb.toString();
    }

    //metoda construita automat dupa implementarea interfetei
    @Override
    public void vanzareOferta() {
        System.out.println("O cazare la "+this.numeHotel+" a fost ocupata.");
    }
}
