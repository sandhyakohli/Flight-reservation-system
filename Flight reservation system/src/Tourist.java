import java.util.List;

public class Tourist{
    public long PNR;
    public int seatNumber;
    public double price;
    public String status;
    public static final int maxNoLocation =5;
    public Address hotelAddress;
    public static List<String> touristLocation;
    public Tourist(long PNR, int seatNumber,Address hotelAddress,List<String> touristLocation) {
        this.PNR=PNR;
        this.seatNumber=seatNumber;
        this.price=price;
        this.hotelAddress=hotelAddress;
        this.touristLocation=touristLocation;
    }

    public void setlocation(List<String> location) {
    	touristLocation.addAll(location);
    }
    public List<String> getTouristLocation(){
        return touristLocation;
    }
}
