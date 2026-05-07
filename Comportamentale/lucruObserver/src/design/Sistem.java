package design;

import java.util.List;

public class Sistem implements ISistemAlerta{
    private String numeSistem;
    //facut o lista care sa tina cui trimit alerta
    private List<IObserver> listaAdmini;

    //generate constructor cu tot cu lista
    public Sistem(String numeSistem, List<IObserver> listaAdmini) {
        this.numeSistem = numeSistem;
        this.listaAdmini = listaAdmini;
    }

    //adaug operatia de a pune in lista un obiect catre care sa imping alerta
    @Override
    public void adaugaAdmin(IObserver observer) {
        listaAdmini.add(observer);
    }

    @Override
    public void stergeAdmin(IObserver observer) {
        listaAdmini.remove(observer);
    }

    //parcurg lista, unde daca exista un admin in lista de admini, acelor admini le trimit alerta
    @Override
    public void trimiteAlerta(String mesaj) {
        for(IObserver admin: listaAdmini){
            admin.receptionareMesaj(mesaj);
        }
    }

    public void alertaIncidentMajor(){
        trimiteAlerta("Incident major in sistem!!!");
    }

    public void alertaBreach(){
        trimiteAlerta("A fost un breach in sistem!!!");
    }
}
