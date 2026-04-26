package design;

import java.util.List;

public class Cabinet {
    //atribute cu PRIVATE
    private String numeCabinet;
    private List<Integer> nrScauneLibere;
    private List<Integer> nrScauneOcupate;

    //constructor cu generate

    public Cabinet(String numeCabinet, List<Integer> nrScauneLibere, List<Integer> nrScauneOcupate) {
        this.numeCabinet = numeCabinet;
        this.nrScauneLibere = nrScauneLibere;
        this.nrScauneOcupate = nrScauneOcupate;
    }


    //toString cu generate

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cabinet{");
        sb.append("numeCabinet='").append(numeCabinet).append('\'');
        sb.append(", nrScauneLibere=").append(nrScauneLibere);
        sb.append(", nrScauneOcupate=").append(nrScauneOcupate);
        sb.append('}');
        return sb.toString();
    }
}
