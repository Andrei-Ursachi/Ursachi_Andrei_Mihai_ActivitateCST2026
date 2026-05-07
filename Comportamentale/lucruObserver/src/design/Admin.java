package design;

public class Admin implements IObserver {
    private String nume;
    private String departament;
    private int nivelAcces;

    //generate constructor
    public Admin(String nume, String departament, int nivelAcces) {
        this.nume = nume;
        this.departament = departament;
        this.nivelAcces = nivelAcces;
    }

    @Override
    public void receptionareMesaj(String mesaj) {
        System.out.println(nume + " a primit notificarea "+mesaj);
    }
}
