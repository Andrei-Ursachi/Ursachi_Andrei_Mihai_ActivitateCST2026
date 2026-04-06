package design;

public class ComandaMixta extends ComandaMancare{

    @Override
    String getProduseComanda() {
        return "shaorma, cartofi, falafel, sos";
    }

    @Override
    int getPret() {
        return 300;
    }
}
