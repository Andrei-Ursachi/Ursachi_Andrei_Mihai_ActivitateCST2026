package design;

public class MetodaLivrare implements IMetodaLivrare{
    private String tipTransport;
    private int durata;
    private String numeLivrator;

    //generate constructor
    public MetodaLivrare(String tipTransport, int durata, String numeLivrator) {
        this.tipTransport = tipTransport;
        this.durata = durata;
        this.numeLivrator = numeLivrator;
    }

    //generate toString
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MetodaLivrare{");
        sb.append("tipTransport='").append(tipTransport).append('\'');
        sb.append(", durata=").append(durata);
        sb.append(", numeLivrator='").append(numeLivrator).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void procesLivrare() {
        System.out.println("Colet livrat pe cale: "+this.tipTransport);
    }
}
