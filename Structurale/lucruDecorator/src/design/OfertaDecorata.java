package design;

//clasa decorata MOSTENESTE prin extends anularea
public class OfertaDecorata extends AnulareCazare{
    public OfertaDecorata(InterfaceCazare cazare) {
        super(cazare);
    }

    //poate fi creata automat dupa ce folosesc extends
    @Override
    public void anulareCazare() {
        System.out.println("Cazare anulata la hotelul "+super.getCazareHotel());
    }
}
