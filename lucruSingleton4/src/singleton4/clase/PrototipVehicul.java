package singleton4.clase;

public class PrototipVehicul {
    private String numePrototip;
    private String tipMotor;
    private int caiPutere;
    private boolean poateZbura;
    private String modelBlindaj;

    private PrototipVehicul(String numePrototip, String tipMotor, int caiPutere, boolean poateZbura, String modelBlindaj) {
        this.numePrototip = numePrototip;
        this.tipMotor = tipMotor;
        this.caiPutere = caiPutere;
        this.poateZbura = poateZbura;
        this.modelBlindaj = modelBlindaj;
    }

    private static PrototipVehicul instanta = null;

    public static synchronized PrototipVehicul getInstance(String numePrototip, String tipMotor, int caiPutere, boolean poateZbura, String modelBlindaj){
        if(instanta == null){
            instanta = new PrototipVehicul(numePrototip, tipMotor, caiPutere, poateZbura, modelBlindaj);
        }
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PrototipVehicul{");
        sb.append("numePrototip='").append(numePrototip).append('\'');
        sb.append(", tipMotor='").append(tipMotor).append('\'');
        sb.append(", caiPutere=").append(caiPutere);
        sb.append(", poateZbura=").append(poateZbura);
        sb.append(", modelBlindaj='").append(modelBlindaj).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
