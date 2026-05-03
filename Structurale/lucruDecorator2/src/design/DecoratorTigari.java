package design;

//aici mostenesc decoratorul clasei principale
public class DecoratorTigari extends DecoratorComandaMancare{
    //dau un atribut privat
    private int nrPachete;

    //constructor super care  e generat de IDE la care trebuie sa adaug atributul de mai sus
    public DecoratorTigari(ComandaMancare comanda1, int nrPachete) {
        super(comanda1);
        this.nrPachete = nrPachete;
    }

    //metode override pe care le pot face cu generate
    @Override
    public String getProduseComanda() {
        return super.getProduseComanda() + " pachet malboro" + this.nrPachete;
    }

    @Override
    public int getPret() {
        return super.getPret() * this.nrPachete;
    }

}
