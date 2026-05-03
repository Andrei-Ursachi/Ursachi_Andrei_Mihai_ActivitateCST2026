package singleton2.clase;

public class Scrisoare {
    private String titlu;
    private int greutate;
    private String expeditor;
    private String destinatar;

    private static Scrisoare instanta = null;

    private Scrisoare(String titlu, int greutate, String expeditor, String destinatar) {
        this.titlu = titlu;
        this.greutate = greutate;
        this.expeditor = expeditor;
        this.destinatar = destinatar;
    }

    public static synchronized Scrisoare getInstance(String titlu, int greutate, String expeditor, String destinatar){
        if(instanta == null){
            instanta = new Scrisoare(titlu, greutate, expeditor, destinatar);
        }
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Scrisoare{");
        sb.append("titlu='").append(titlu).append('\'');
        sb.append(", greutate=").append(greutate);
        sb.append(", expeditor='").append(expeditor).append('\'');
        sb.append(", destinatar='").append(destinatar).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
