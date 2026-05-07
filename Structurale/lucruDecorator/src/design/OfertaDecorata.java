package design;

//clasa decorata MOSTENESTE prin extends anularea
public class OfertaDecorata extends AnulareCazare{
    public OfertaDecorata(InterfaceCazare cazare) {
        super(cazare);
    }

    //poate fi creata automat dupa ce folosesc extends
    //continutul sa fie ceva text + super. apel la metoda de cancel din clasa abstracta
    @Override
    public void anulareCazare() {
        System.out.println("Cazare anulata la hotelul "+super.getCazareHotel());
    }
}
