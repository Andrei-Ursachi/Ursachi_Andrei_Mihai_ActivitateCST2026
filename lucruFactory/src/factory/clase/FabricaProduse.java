package factory.clase;

public class FabricaProduse {

    private static FabricaProduse instanta = null;

    public static synchronized FabricaProduse getInstance(){
        if(instanta == null){
            instanta = new FabricaProduse();
        }
        return instanta;
    }

    private FabricaProduse(){

    }

    public ProdusePromotionale getProdusePromotionale(TipProdus tip, String materialFolosit){
        return switch(tip){
            case TipProdus.Flyer -> new Flyer(materialFolosit);
            case TipProdus.Poster -> new Poster(materialFolosit);
            case TipProdus.Sticker -> new Sticker(materialFolosit);
            default -> null;
        };
    }
}
