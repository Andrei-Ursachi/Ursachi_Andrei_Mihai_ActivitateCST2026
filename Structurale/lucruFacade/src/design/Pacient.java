package design;

public class Pacient {
    //cateva atribute PRIVATE
    private String nume;
    private int varsta;
    private int dificultateInterventie;

    //generate constructor
    public Pacient(String nume, int varsta, int dificultateInterventie) {
        this.nume = nume;
        this.varsta = varsta;
        this.dificultateInterventie = dificultateInterventie;
    }

    public boolean verificareStarePacient(){
        if(dificultateInterventie<=2){
            return false;
        }
        return true;
    }

    //generate toString
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", dificultateInterventie=").append(dificultateInterventie);
        sb.append('}');
        return sb.toString();
    }
}
