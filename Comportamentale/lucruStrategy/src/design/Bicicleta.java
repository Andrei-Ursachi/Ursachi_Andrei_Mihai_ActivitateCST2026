package design;

public class Bicicleta implements IModTransport {
    @Override
    public void deplasare(String numePersoana, double timpDeplasare) {
        System.out.println(numePersoana+" s-a deplasat cu bicicleta timp de "+timpDeplasare+" ore.");
    }
}
