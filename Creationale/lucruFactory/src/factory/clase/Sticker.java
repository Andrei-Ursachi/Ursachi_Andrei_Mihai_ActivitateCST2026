package factory.clase;

public class Sticker extends ProdusePromotionale{
    public Sticker(String materialFolosit) {
        super(materialFolosit);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sticker{");
        sb.append("materialFolosit='").append(materialFolosit).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
