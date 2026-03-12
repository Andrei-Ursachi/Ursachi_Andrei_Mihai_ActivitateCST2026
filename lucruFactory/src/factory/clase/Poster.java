package factory.clase;

public class Poster extends ProdusePromotionale {
    public Poster(String materialFolosit) {
        super(materialFolosit);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Poster{");
        sb.append("materialFolosit='").append(materialFolosit).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
