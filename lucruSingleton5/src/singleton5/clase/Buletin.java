package singleton5.clase;

public class Buletin {
    private int cnp;
    private String nume;
    private String serie;

    private Buletin(int cnp, String nume, String serie) {
        this.cnp = cnp;
        this.nume = nume;
        this.serie = serie;
    }

    private static Buletin instanta = null;

    public static synchronized Buletin getInstance(int cnp, String nume, String serie){
        if(instanta == null){
            instanta = new Buletin(cnp, nume, serie);
        }
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Buletin{");
        sb.append("cnp=").append(cnp);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", serie=").append(serie);
        sb.append('}');
        return sb.toString();
    }
}
