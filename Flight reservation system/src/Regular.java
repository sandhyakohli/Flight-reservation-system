import java.util.List;

public class Regular{
    public String PNR;
    public String seatNumber;
    public String price;
    public String status;
    public List<String> specialService;
    public Regular(String PNR, String seatNumber, String price , String status, List<String>specialService) {
        this.PNR=PNR;
        this.specialService=specialService;
        this.seatNumber=seatNumber;
        this.price=price;

    }


    public List<String> getSpecialService(){
        return specialService;
    }

}
