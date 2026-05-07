package design;

public interface ISistemAlerta {
    void adaugaAdmin(IObserver observer);
    void stergeAdmin(IObserver observer);
    void trimiteAlerta(String mesaj);
}
