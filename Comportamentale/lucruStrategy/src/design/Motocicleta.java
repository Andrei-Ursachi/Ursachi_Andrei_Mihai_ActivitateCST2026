package design;

public class Motocicleta implements IModTransport {
    @Override
    public void deplasare(String numePersoana, double timpDeplasare) {
        System.out.println(numePersoana+" s-a deplasat cu motocicleta timp de "+timpDeplasare+" ore.");
    }
}
