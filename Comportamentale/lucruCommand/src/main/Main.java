package main;

import design.*;

public class Main {
    public static void main(String[] args) {
        IColet colet1 = new ColeteMici(5, 25, true, "Craiova");
        IColet colet2 = new ColeteMari(500, 2000, true, "Constanta");
        ILivrare livrare = new ColetLivrare(colet1);
        ILivrare rezervareLivrare = new ColetRezervatLivrare(colet1);

        Operator operator = new Operator();
        operator.actiune(livrare);
        operator.actiune(rezervareLivrare);
    }

}
