package builder.clase;

public class Comanda {
    private boolean cuSos;
    private boolean cuCartofi;
    private String denumireShaorma;
    private String tipCarne;
    private float greutate;
    //constructor cu toti parametri
    public Comanda(boolean cuSos, boolean cuCartofi, String denumireShaorma, String tipCarne, float greutate) {
        this.cuSos = cuSos;
        this.cuCartofi = cuCartofi;
        this.denumireShaorma = denumireShaorma;
        this.tipCarne = tipCarne;
        this.greutate = greutate;
    }
    //constructor fara parametri
    public Comanda() {
        this.cuSos = false;
        this.cuCartofi = false;
        this.denumireShaorma = "Cu de toate";
        this.tipCarne = "vita";
        this.greutate = 700;
    }
    //setteri pt toate atributele
    public void setCuSos(boolean cuSos) {
        this.cuSos = cuSos;
    }

    public void setCuCartofi(boolean cuCartofi) {
        this.cuCartofi = cuCartofi;
    }

    public void setDenumireShaorma(String denumireShaorma) {
        this.denumireShaorma = denumireShaorma;
    }

    public void setTipCarne(String tipCarne) {
        this.tipCarne = tipCarne;
    }

    public void setGreutate(float greutate) {
        this.greutate = greutate;
    }
    //generate tostring
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Comanda{");
        sb.append("cuSos=").append(cuSos);
        sb.append(", cuCartofi=").append(cuCartofi);
        sb.append(", denumireShaorma='").append(denumireShaorma).append('\'');
        sb.append(", tipCarne='").append(tipCarne).append('\'');
        sb.append(", greutate=").append(greutate);
        sb.append('}');
        return sb.toString();
    }
}
