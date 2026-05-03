package design;

public class ComandaMixta extends ComandaMancare{

    @Override
    public String getProduseComanda() {
        return "shaorma, cartofi, falafel, sos";
    }

    @Override
    public int getPret() {
        return 300;
    }
}
