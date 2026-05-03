package design;

public class ColetLivrareAdapter implements IColet{
    //clasa adapter o sa ia mereu un obiect din proiectul nou, in cazul de fata metoda de livrare
    private IMetodaLivrare metodaLivrare;

    public ColetLivrareAdapter(IMetodaLivrare metodaLivrare) {
        this.metodaLivrare = metodaLivrare;
    }

    //aici "ascund" apel la metoda din interfata proiectului nou
    @Override
    public void livrareColet() {
        metodaLivrare.procesLivrare();
    }
}
