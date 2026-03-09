package singleton.clasa;

public class Agentie {
    private String numeAgentie;
    private int nrAngajati;

    //fac prin lazy init
    private static Agentie instanta = null;

    // la singleton NEAPARAT constructor PRIVAT
    private Agentie(String numeAgentie, int nrAngajati) {
        this.numeAgentie = numeAgentie;
        this.nrAngajati = nrAngajati;
    }

    public static synchronized Agentie getInstance(String numeAgentie, int nrAngajati){
        if(instanta == null) {
            instanta = new Agentie(numeAgentie, nrAngajati);
        }
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Agentie{");
        sb.append("numeAgentie='").append(numeAgentie).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append('}');
        return sb.toString();
    }
}
