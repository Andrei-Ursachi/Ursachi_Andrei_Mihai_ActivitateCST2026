package design;

public class Masina implements IModTransport{
    @Override
    public void deplasare(String numePersoana, double timpDeplasare) {
        System.out.println(numePersoana+" s-a deplasat cu masina timp de "+timpDeplasare+" ore.");
    }
}
