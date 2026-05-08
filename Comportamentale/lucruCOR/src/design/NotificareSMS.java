package design;

public class NotificareSMS extends ANotificare {
    @Override
    public void notificareClient(Client client, String mesaj) {
        if(client.getNrTelefon()!=null){
            System.out.println(client.getNume()+" a fost notificat cu mesaj "+mesaj);
        }else{
            super.getNotificare().notificareClient(client, mesaj);
        }
    }
}
