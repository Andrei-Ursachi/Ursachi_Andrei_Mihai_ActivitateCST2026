package design;

public class Client {
    private int id;
    private String nume;
    private String email;
    private String nrTelefon;

    //generate constructor
    public Client(int id, String nume, String email, String nrTelefon) {
        this.id = id;
        this.nume = nume;
        this.email = email;
        this.nrTelefon = nrTelefon;
    }

    //generate getter pt cate atribuite e nevoie
    public String getEmail() {
        return email;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }
}
