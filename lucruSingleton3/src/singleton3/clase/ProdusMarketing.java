package singleton3.clase;

import java.util.Stack;

public class ProdusMarketing {
    private String numeProdus;
    private int nrBucati;
    private boolean unic;

    private ProdusMarketing(String numeProdus, int nrBucati, boolean unic) {
        this.numeProdus = numeProdus;
        this.nrBucati = nrBucati;
        this.unic = unic;
    }

    private static ProdusMarketing instanta = null;

    public static synchronized ProdusMarketing getInstance(String numeProdus, int nrBucati, boolean unic){
        if(instanta == null){
            instanta = new ProdusMarketing(numeProdus, nrBucati, unic);
        }
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProdusMarketing{");
        sb.append("numeProdus='").append(numeProdus).append('\'');
        sb.append(", nrBucati=").append(nrBucati);
        sb.append(", unic=").append(unic);
        sb.append('}');
        return sb.toString();
    }
}
