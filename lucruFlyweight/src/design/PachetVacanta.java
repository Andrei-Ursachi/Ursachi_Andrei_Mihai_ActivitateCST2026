package design;

public class PachetVacanta implements IComplet{
    private int cod;
    private String hotel;
    private String destinatie;
    private String modTransport;

    //generate constructor
    public PachetVacanta(int cod, String hotel, String destinatie, String modTransport) {
        this.cod = cod;
        this.hotel = hotel;
        this.destinatie = destinatie;
        this.modTransport = modTransport;
    }

    //generate toString
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PachetVacanta{");
        sb.append("cod=").append(cod);
        sb.append(", hotel='").append(hotel).append('\'');
        sb.append(", destinatie='").append(destinatie).append('\'');
        sb.append(", modTransport='").append(modTransport).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descriere(Optionale optionale) {
        System.out.println(this.toString()+optionale.toString());
    }
}
