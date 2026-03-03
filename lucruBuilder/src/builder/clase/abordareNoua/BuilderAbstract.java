package builder.clase.abordareNoua;
import builder.clase.Comanda;


public interface BuilderAbstract {
    Comanda build();
     BuilderAbstract setCuSos(boolean cuSos);
     BuilderAbstract setCuCartofi(boolean cuCartofi);
     BuilderAbstract setDenumireShaorma(String denumireShaorma);
     BuilderAbstract setTipCarne(String tipCarne);
     BuilderAbstract setGreutate(float greutate);
}
