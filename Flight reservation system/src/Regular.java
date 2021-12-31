import java.util.List;

public class Regular{
    private String PNR;
    private String seatNumber;
    private String price;
    private String status;
    private Flight flight;
    private Passenger passenger;
    private List<String> specialService;
    public Regular(String PNR, String seatNumber, String price , String status, Flight flight, Passenger passenger,List<String>specialService) {
        this.PNR=PNR;
        this.specialService=specialService;
        this.seatNumber=seatNumber;
        this.price=price;
        this.passenger=passenger;
        this.flight=flight;
    }
    public void setPrice(String price){
        this.price=price;
    }
    public void setSpecialService(List<String> specialService){
        this.specialService=specialService;
    }
    public void addSpecialService(String specialService1){
        specialService.add(specialService1);
    }
    public void deleteSpecialService(String specialService1){
        specialService.remove(specialService1);
    }



    public List<String> getSpecialService(){
        return specialService;
    }

}