package main;

import design.Client;
import design.Oferta;
import design.ProxyOferta;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Mihai", 66);
        Oferta oferta = new Oferta(5000, 22, " vacanta italia", client1);

        ProxyOferta proxyOferta = new ProxyOferta(oferta);
        proxyOferta.rezervaOferta();
    }
}
