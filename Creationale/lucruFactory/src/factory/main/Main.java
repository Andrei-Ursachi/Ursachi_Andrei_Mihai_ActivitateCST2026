package factory.main;

import factory.clase.FabricaProduse;
import factory.clase.ProdusePromotionale;
import factory.clase.TipProdus;

public class Main {
    public static void main(String[] args) {
        FabricaProduse fabrica1 = FabricaProduse.getInstance();
        ProdusePromotionale poster = fabrica1.getProdusePromotionale(TipProdus.Poster, "hartie");
        ProdusePromotionale flyer = fabrica1.getProdusePromotionale(TipProdus.Flyer, "carton");
        ProdusePromotionale sticker = fabrica1.getProdusePromotionale(TipProdus.Sticker, "plastic");

        System.out.println(poster.toString());
        System.out.println(flyer.toString());
        System.out.println(sticker.toString());
    }
}
