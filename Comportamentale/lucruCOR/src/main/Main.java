package main;

import design.*;

public class Main {
    public static void main(String[] args) {
        ANotificare notificareMesaj = new NotificareSMS();
        ANotificare notificareEmail = new NotificareMail();
        ANotificare notificareBackup = new BackupNotificare();

        notificareMesaj.setNotificare(notificareEmail);
        notificareEmail.setNotificare(notificareBackup);

        Client client = new Client(1, "Andrei", null, "08888888888");
        Client client2 = new Client(1, "Vasile", "emailtest1", null);
        Client client3 = new Client(3, "Ion", null, null);
        notificareMesaj.notificareClient(client, "schimbare 1");
        notificareMesaj.notificareClient(client2, "schimbare 2");
        notificareMesaj.notificareClient(client3, "schimbare 3");
    }
}
