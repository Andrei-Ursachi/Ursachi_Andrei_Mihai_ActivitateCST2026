package design;

public class Stomatolog {
    //cateva atribute PRIVATE
    private String numeStomatolog;
    private int aniExperienta;
    private String specializare;

    //constuctor cu generate
    public Stomatolog(String numeStomatolog, int aniExperienta, String specializare) {
        this.numeStomatolog = numeStomatolog;
        this.aniExperienta = aniExperienta;
        this.specializare = specializare;
    }

    //toString cu generate
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Stomatolog{");
        sb.append("numeStomatolog='").append(numeStomatolog).append('\'');
        sb.append(", aniExperienta=").append(aniExperienta);
        sb.append(", specializare='").append(specializare).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void confirmareUrgentarePreluare(Pacient pacient){
        if(pacient.verificareStarePacient()==true){
            System.out.println("Se preia in regim de urgenta");
        }else{
            System.out.println("Se preia in regim normal");
        }
    }
}
