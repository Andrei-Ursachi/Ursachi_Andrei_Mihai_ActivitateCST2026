package Main;
import Design.Biblioteca;
public class Program {
    public static void main(String[] args){
        Biblioteca bib1 = Biblioteca.getInstance("Circului", 14000, 55);
        Biblioteca bib2 = Biblioteca.getInstance("Pantelimon", 8000, 14);

        System.out.println(bib1.getNumeBiblioteca());
        System.out.println(bib2.getNumeBiblioteca());
    }
}
