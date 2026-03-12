package factory.clase;

public class Flyer extends ProdusePromotionale{
    public Flyer(String materialFolosit) {
        super(materialFolosit);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Flyer{");
        sb.append("materialFolosit='").append(materialFolosit).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
