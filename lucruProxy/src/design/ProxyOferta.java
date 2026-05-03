package design;

public class ProxyOferta implements IOferta{
    private Oferta oferta;

    public ProxyOferta(Oferta oferta) {
        this.oferta = oferta;
    }

    //pe aceasta metoda se da conditia in care se ofera sau nu oferta mea
    @Override
    public void rezervaOferta() {
        if(oferta.getClient().getVarstaClient()>65){
            System.out.println("Oferta rezervata pt client"+oferta.getNumeOferta());
        }else{
            System.out.println("Nu se poate rezerva pt acest client");
        }
    }
}
