package design;

public class Persoana {
    private String numePersoana;
    private int varsta;
    private String stareFizica;
    private IModTransport modTransport;

    //generate constructor
    public Persoana(String numePersoana, int varsta, String stareFizica, IModTransport modTransport) {
        this.numePersoana = numePersoana;
        this.varsta = varsta;
        this.stareFizica = stareFizica;
        this.modTransport = modTransport;
    }

    //dau si in aceasta clasa metoda de deplasare
    //unde apelez metoda interfetei prin atributul ei + atributele care au logica din obiectul persoana
    public void deplasare(double timpDeplasare){
        modTransport.deplasare(this.numePersoana, timpDeplasare);
    }

    //setter pt atributul abstract al interfetei ca sa pot modifica din main
    public void setModTransport(IModTransport modTransport) {
        this.modTransport = modTransport;
    }
}
