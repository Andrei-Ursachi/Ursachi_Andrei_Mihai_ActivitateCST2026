package design;

import java.util.List;

public class InformareSpital implements IAlertaSpital{
    private String numeSistem;
    private List<IObserver> listaPacienti;

    public InformareSpital(String numeSistem, List<IObserver> listaPacienti) {
        this.numeSistem = numeSistem;
        this.listaPacienti = listaPacienti;
    }


    @Override
    public void adaugaPacient(IObserver observer) {
        listaPacienti.add(observer);
    }

    @Override
    public void stergerePacient(IObserver observer) {
        listaPacienti.remove(observer);
    }

    @Override
    public void trimiteAlerta(String mesaj) {
        for(IObserver pacient:listaPacienti){
            pacient.receptieMesaj(mesaj);
        }
    }

    public void alertaPandemie(){
        trimiteAlerta("In zona exista pandemie de virus");
    }

    public void alertaVirusMortal(){
        trimiteAlerta("In zona exista un virus mortal");
    }
}