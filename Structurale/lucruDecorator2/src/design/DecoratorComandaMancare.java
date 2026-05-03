package design;

//din nou clasa abstracta la decoratorul clasei principale - mosteneste clasa principala
public abstract class DecoratorComandaMancare extends ComandaMancare{
    //creez un obiect pt clasa principala ca PROTECTED
    protected ComandaMancare comanda1;

    //pot face un constructor cu generate dar neaparat sa introduc in el super()
    public DecoratorComandaMancare(ComandaMancare comanda1) {
        super();
        this.comanda1 = comanda1;
    }

    //generate override methods pt cele 2 functii de get din clasa principala
    // si ii pun sa returneze valorile de get pt. obiectul creat
    public String getProduseComanda(){
        return comanda1.getProduseComanda();
    }

    @Override
    public int getPret() {
        return comanda1.getPret();
    }
}
