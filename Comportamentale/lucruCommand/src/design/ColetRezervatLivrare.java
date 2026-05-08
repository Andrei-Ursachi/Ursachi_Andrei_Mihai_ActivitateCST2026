package design;

public class ColetRezervatLivrare implements ILivrare {
    private IColet colet;

    public ColetRezervatLivrare(IColet colet) {
        this.colet = colet;
    }

    @Override
    public void executare() {
        colet.rezervareLivrare();
    }
}
