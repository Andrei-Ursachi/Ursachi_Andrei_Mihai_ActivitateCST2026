package design;

//neaparat clasa abstracta
public abstract class AnulareCazare implements InterfaceCazare{
    private InterfaceCazare cazare;
    @Override
    public void vanzareOferta() {
        cazare.vanzareOferta();
    }

    //generate constructor
    public AnulareCazare(InterfaceCazare cazare) {
        this.cazare = cazare;
    }

    //fac o metoda de get
    public String getCazareHotel(){
        return ((Cazare)cazare).getNumeHotel();
    }

    public abstract void anulareCazare();
}
