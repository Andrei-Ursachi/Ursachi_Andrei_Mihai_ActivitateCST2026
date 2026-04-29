package main;

import design.Categorie;
import design.CategorieComposite;

public class Main {
    public static void main(String[] args) {
        Categorie nodComposite1 = new CategorieComposite("Curse cu masini");
        Categorie nodComposite2 = new CategorieComposite("Curse cu motociclete");
        Categorie nodComposite3 = new CategorieComposite("Curse cu barci");
    }
}
