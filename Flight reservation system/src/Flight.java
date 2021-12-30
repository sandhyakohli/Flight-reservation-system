
public class Flight {
   public String flightNumber ;
    public String airline;
    public String flightCapacity;
    public String numberOfSeats;
    public String currentCapacity;
    public  String depLocation ;
    public String destLocation;
    public String depDateTime ;
    public String destDateTime;
    public Flight(String flightNumber , String airline, String flightCapacity, String numberOfSeats, String currentCapacity,
                  String depLocation, String destLocation, String depDateTime, String destDateTime ){
     this.flightNumber=flightNumber;
     this.airline=airline;
     this.flightCapacity=flightCapacity;
     this.numberOfSeats=numberOfSeats;
     this.currentCapacity=currentCapacity;
     this.depLocation=depLocation;
     this.destLocation=destLocation;
     this.depDateTime=depDateTime;
     this.destDateTime=destDateTime;
    }


}
