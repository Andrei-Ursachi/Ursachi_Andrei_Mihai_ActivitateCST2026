package singleton.main;

import singleton.clasa.Agentie;

public class Main {
    public static void main(String[] args) {
        Agentie agentie1 = Agentie.getInstance("AgeTur", 15);
        //System.out.println(agentie1.toString());
        System.out.println(agentie1);

        //aici tot obiectul agentie1 o sa fie aratat pt ca eu am o singura instanta care e apelata
        Agentie agentie2 = Agentie.getInstance("ChristianTour", 12);
        System.out.println(agentie2);
    }
}
