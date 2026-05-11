package design;

public class Pacient implements IObserver {
    private String numePacient;
    private int varstaPacient;
    private boolean pacientInregistrat;

    public Pacient(String numePacient, int varstaPacient, boolean pacientInregistrat) {
        this.numePacient = numePacient;
        this.varstaPacient = varstaPacient;
        this.pacientInregistrat = pacientInregistrat;
    }


    @Override
    public void receptieMesaj(String mesaj) {
        System.out.println(numePacient + " a primit mesajul: "+mesaj);
    }
}