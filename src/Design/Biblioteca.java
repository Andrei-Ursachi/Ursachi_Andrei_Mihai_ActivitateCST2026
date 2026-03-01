package Design;

public class Biblioteca {
    private String numeBiblioteca;
    private float valoareColectie;
    private int nrAngajati;

    private static final Biblioteca instanta = new Biblioteca();
    private Biblioteca(){
        this.numeBiblioteca = "Carturesti";
        this.valoareColectie = 2000;
        this.nrAngajati = 13;
    }

    public java.lang.String getNumeBiblioteca() {
        return numeBiblioteca;
    }

    public void setNumeBiblioteca(java.lang.String numeBiblioteca) {
        this.numeBiblioteca = numeBiblioteca;
    }

    public float getValoareColectie() {
        return valoareColectie;
    }

    public void setValoareColectie(float valoareColectie) {
        this.valoareColectie = valoareColectie;
    }

    public int getNrAngajati() {
        return nrAngajati;
    }

    public void setNrAngajati(int nrAngajati) {
        this.nrAngajati = nrAngajati;
    }

    public static Biblioteca getInstance(String numeBiblioteca, float valoareColectie, int nrAngajati){
        return instanta;
    }
}
