package design;

public class ColetLivrare implements ILivrare{
    private IColet colet;

    public ColetLivrare(IColet colet) {
        this.colet = colet;
    }

    @Override
    public void executare() {
        colet.livrareColet();
    }
}
