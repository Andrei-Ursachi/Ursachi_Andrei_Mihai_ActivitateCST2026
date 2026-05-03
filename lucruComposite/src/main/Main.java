package main;

import design.Categorie;
import design.CategorieComposite;
import design.CategorieCopil;

public class Main {
    public static void main(String[] args) throws Exception {
        //la composite trebuie sa gandesc ca o scare ierarhica si sa pun elementele copil in elementele parinte
        Categorie nodComposite1 = new CategorieComposite("Curse");
        Categorie nodComposite2 = new CategorieComposite("Curse cu motociclete");
        Categorie nodComposite3 = new CategorieComposite("Curse cu masini");
        Categorie nodComposite4 = new CategorieComposite("Varianta exotica");

        Categorie nodCopil1 = new CategorieCopil("Motociclete");
        Categorie nodCopil2 = new CategorieCopil("Scootere");

        Categorie nodCopil4 = new CategorieCopil("F1");
        Categorie nodCopil5 = new CategorieCopil("Supercars");
        Categorie nodCopil6 = new CategorieCopil("Hypercars");

        nodComposite1.adaugaNod(nodComposite2);
        nodComposite1.adaugaNod(nodComposite3);

        nodComposite2.adaugaNod(nodCopil1);
        nodComposite2.adaugaNod(nodCopil2);

        nodComposite3.adaugaNod(nodComposite4);
        nodComposite3.adaugaNod(nodCopil4);

        nodComposite4.adaugaNod(nodCopil5);
        nodComposite4.adaugaNod(nodCopil6);

        nodComposite1.descriere(" ");
    }
}
