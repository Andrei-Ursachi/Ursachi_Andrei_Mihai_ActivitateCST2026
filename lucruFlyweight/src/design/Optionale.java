package design;

public class Optionale {
    private boolean masa1;
    private boolean masa2;
    private boolean masa3;
    private int nrTrasee;

    //generate constructor
    public Optionale(boolean masa1, boolean masa2, boolean masa3, int nrTrasee) {
        this.masa1 = masa1;
        this.masa2 = masa2;
        this.masa3 = masa3;
        this.nrTrasee = nrTrasee;
    }

    //generate toString
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Optionale{");
        sb.append("masa1=").append(masa1);
        sb.append(", masa2=").append(masa2);
        sb.append(", masa3=").append(masa3);
        sb.append(", nrTrasee=").append(nrTrasee);
        sb.append('}');
        return sb.toString();
    }
}
