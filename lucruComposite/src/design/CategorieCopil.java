package design;

public class CategorieCopil implements Categorie{
    private String nume;

    public CategorieCopil(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugaNod(Categorie nod) throws Exception {
        throw new Exception("Este nod copil");
        //dupa ce adaug exceptia apare pe metoda eroare ca se rezolva cu click pe eroare si add to method
        //sau adaugare in metoda de throw Exception
    }

    @Override
    public void getNod(int index) throws Exception {
        throw new Exception("Este nod copil");
    }

    @Override
    public void stergeNod(Categorie nod) throws Exception {
        throw new Exception("Este nod copil");
    }

    @Override
    public void descriere() {
        System.out.println("Obiect: " +this.nume);
    }
}
