package design;

import java.util.ArrayList;
import java.util.List;

public class CategorieComposite implements Categorie{
    private String numeNodComposite;

    List<Categorie> listaCategorii = new ArrayList<>();

    //generate constructor FARA lista
    public CategorieComposite(String numeNodComposite) {
        this.numeNodComposite = numeNodComposite;
    }

    @Override
    public void adaugaNod(Categorie nod) {
        listaCategorii.add(nod);
    }

    @Override
    public void getNod(int index) {
        listaCategorii.get(index);
    }

    @Override
    public void stergeNod(Categorie nod) throws Exception {
        listaCategorii.remove(nod);
    }

    @Override
    public void descriere() {
        System.out.println("Categori: "+this.numeNodComposite);
        for (Categorie elem:listaCategorii){
            elem.descriere();
        }
    }
}
