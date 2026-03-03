package builder.clase.abordareNoua;

import builder.clase.Comanda;

public class ComandaBuilder implements BuilderAbstract {
    private Comanda comanda = null;
    public ComandaBuilder(){
        comanda = new Comanda();
    }

    public BuilderAbstract setCuSos(boolean cuSos){
        comanda.setCuSos(cuSos);
        return this;
    }

     public BuilderAbstract setCuCartofi(boolean cuCartofi){
        comanda.setCuCartofi(cuCartofi);
        return this;
    }

    public BuilderAbstract setDenumireShaorma(String denumireShaorma){
        comanda.setDenumireShaorma(denumireShaorma);
        return this;
    }

    public BuilderAbstract setTipCarne(String tipCarne){
        comanda.setTipCarne(tipCarne);
        return this;
    }

    public BuilderAbstract setGreutate(float greutate){
        comanda.setGreutate(greutate);
        return this;
    }

    @Override
    public Comanda build() {
        return comanda;
    }


}
