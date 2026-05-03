package design;

public class Colet implements IColet{
    private String destinatie;
    private float greutate;
    private boolean verificareLaLivrare;

    //generate constructor
    public Colet(String destinatie, float greutate, boolean verificareLaLivrare) {
        this.destinatie = destinatie;
        this.greutate = greutate;
        this.verificareLaLivrare = verificareLaLivrare;
    }

    //generate toString
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Colet{");
        sb.append("destinatie='").append(destinatie).append('\'');
        sb.append(", greutate=").append(greutate);
        sb.append(", verificareLaLivrare=").append(verificareLaLivrare);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void livrareColet() {
        System.out.println("S-a livrat colet cu destinatia: "+this.destinatie);
    }
}
