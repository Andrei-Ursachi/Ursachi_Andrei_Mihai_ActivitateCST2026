package prototype.clase;

public class Vizita implements Prototype{
    private String nume;
    private int ziVizita;
    private int nrPersoane;

    public Vizita(String nume, int ziVizita, int nrPersoane) {
        if(nume.length()>3){
            this.nume = nume;
        }else{
            this.nume = "NaN";
        }
        if(ziVizita > 1 && ziVizita < 31){
            this.ziVizita = ziVizita;
        }else{
            this.ziVizita = 0;
        }
        if(nrPersoane > 0){
            this.nrPersoane = nrPersoane;
        }

    }

    private Vizita(){

    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vizita{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", ziVizita=").append(ziVizita);
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Prototype copiaza() {
        Vizita vizita = new Vizita();
        vizita.nume = this.nume;
        vizita.ziVizita = this.ziVizita;
        vizita.nrPersoane = this.nrPersoane;
        return vizita;
    }
}
