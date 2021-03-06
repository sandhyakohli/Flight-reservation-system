import java.util.List;

public class Tourist extends Ticket{
   ;
    private double price;
    protected String status;
    private static final int maxNoLocation =5;
    private Address hotelAddress;
    private Flight flight;
    private Passenger passenger;
    private static List<String> touristLocation;
    public Tourist(long PNR, int seatNumber,Address hotelAddress,List<String> touristLocation) {
        super(PNR,seatNumber);
        this.price=price;
        this.hotelAddress=hotelAddress;
        this.touristLocation=touristLocation;
        this.status="confirmed";
    }
    public void setPrice(double price){
        this.price=price;
    }
    public Address getHotelAddress(){
        return hotelAddress;
    }
    public void setHotelAddress(Address hotelAddress){
        this.hotelAddress=hotelAddress;
    }


    public void setlocation(List<String> location) {
        touristLocation.addAll(location);
    }
    public List<String> getTouristLocation(){
        return touristLocation;
    }
}

