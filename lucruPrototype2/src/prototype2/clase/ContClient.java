package prototype2.clase;

public class ContClient implements InterfataContClient {
    private String numeCont;
    private String email;
    private int nrCaractereParola;

    public ContClient(String tipCont, String email, int nrCaractereParola) {
        if(tipCont.length()>3 ){
            this.numeCont = tipCont;
        }else{
            this.numeCont = "nume eroare";
        }
        if(email.length()>5){
            this.email = email;
        }else{
            this.email = "incearca mai mult";
        }
        if(nrCaractereParola>0){
            this.nrCaractereParola = nrCaractereParola;
        }
    }

    private ContClient(){
        this.numeCont = "Admin";
        this.email = "test@mail.com";
        this.nrCaractereParola = 10;
        
    }

    public void setNrCaractereParola(int nrCaractereParola) {
        this.nrCaractereParola = nrCaractereParola;
    }

    @Override
    public InterfataContClient copy() {
        ContClient cont1 = new ContClient();
        cont1.numeCont = this.numeCont;
        cont1.email = this.email;
        cont1.nrCaractereParola = this.nrCaractereParola;
        return cont1;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContClient{");
        sb.append("numeCont='").append(numeCont).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", nrCaractereParola=").append(nrCaractereParola);
        sb.append('}');
        return sb.toString();
    }
}
