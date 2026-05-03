package design;

public interface Categorie {
    void adaugaNod(Categorie nod) throws Exception;
    void getNod(int index) throws Exception;
    void stergeNod(Categorie nod) throws Exception;
    void descriere(String indent);
}
