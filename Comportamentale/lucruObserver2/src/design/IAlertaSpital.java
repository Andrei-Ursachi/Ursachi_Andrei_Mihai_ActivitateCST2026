package design;

public interface IAlertaSpital {
    void adaugaPacient(IObserver observer);
    void stergerePacient(IObserver observer);
    void trimiteAlerta(String mesaj);
}
