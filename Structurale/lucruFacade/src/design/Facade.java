package design;

import java.util.List;

public class Facade {
    public void tratarePacient(String nume, int varsta, int dificultateInterventie,
                               String numeStomatolog, int aniExperienta, String specializare,
                                String numeCabinet, List<Integer> nrScauneLibere, List<Integer> nrScauneOcupate, int nrScaun){
        Pacient pacient = new Pacient(nume, varsta, dificultateInterventie);
        Stomatolog stomatolog = new Stomatolog(numeStomatolog, aniExperienta, specializare);
        Cabinet cabinet = new Cabinet(numeCabinet, nrScauneLibere, nrScauneOcupate);

        pacient.verificareStarePacient();
        stomatolog.confirmareUrgentarePreluare(pacient);
        cabinet.verificareScaun(nrScaun);
    }
}
