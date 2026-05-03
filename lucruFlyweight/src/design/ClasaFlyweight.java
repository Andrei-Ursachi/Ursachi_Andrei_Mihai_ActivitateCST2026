package design;

import java.util.HashMap;
import java.util.Map;

public class ClasaFlyweight {
    private Map<Integer, PachetVacanta> mapPachet = new HashMap<>();
    public PachetVacanta getPachet(int cod, String hotel, String destinatie, String modTransport){
        if(mapPachet.get(cod)==null){
            PachetVacanta pachetVacanta = new PachetVacanta(cod, hotel, destinatie, modTransport);
            mapPachet.put(cod, pachetVacanta);
        }
        return mapPachet.get(cod);
    }
}
