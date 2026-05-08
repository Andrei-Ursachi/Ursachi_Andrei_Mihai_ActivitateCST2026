package design;

public class NotificareMail extends ANotificare {
    @Override
    public void notificareClient(Client client, String mesaj) {
        if(client.getEmail()!=null){
            System.out.println(client.getNume()+ " a fost notificat prin email cu mesajul: "+mesaj);
        }else{
            super.getNotificare().notificareClient(client,mesaj);
        }
    }
}
