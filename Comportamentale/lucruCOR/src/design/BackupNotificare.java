package design;

public class BackupNotificare extends  ANotificare {
    @Override
    public void notificareClient(Client client, String mesaj) {
        System.out.println(client.getNume()+" nu are date de contact!");
    }
}
