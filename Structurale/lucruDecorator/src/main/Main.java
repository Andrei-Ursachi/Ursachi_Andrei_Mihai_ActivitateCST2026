package main;

import design.AnulareCazare;
import design.Cazare;
import design.InterfaceCazare;
import design.OfertaDecorata;

public class Main {
    public static void main(String[] args) {
        InterfaceCazare cazare = new Cazare("Hotel1", 500, 7);
        cazare.vanzareOferta();
        AnulareCazare ofertaDecorata = new OfertaDecorata(cazare);
        ofertaDecorata.anulareCazare();
        ofertaDecorata.vanzareOferta();
    }
}
