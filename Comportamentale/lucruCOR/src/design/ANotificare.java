package design;

//neaparat clasa sa fie abstracta la notificator
public abstract class ANotificare {
    private ANotificare notificare;

    //generate getter si setter
    public ANotificare getNotificare() {
        return notificare;
    }

    public void setNotificare(ANotificare notificare) {
        this.notificare = notificare;
    }

    //functie abstracta care sa se ocupe de notificari
    public abstract void notificareClient(Client client, String mesaj);


}
