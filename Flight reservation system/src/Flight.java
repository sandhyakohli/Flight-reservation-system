
public class Flight {
 private String flightNumber ;
 private String airline;
 private String flightCapacity;
 private String numberOfSeats;
 private String currentCapacity;
 private   String depLocation ;
 private String destLocation;
 private String depDateTime ;
 private String destDateTime;
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
 public  String getAirline(){
  return airline;
 }
 public void setAirlines(String airlines){
  this.airline=airlines;
 }
 public  String getFlightNumber(){
  return flightNumber;
 }
 public void setFlightNumber(String flightNumber){
  this.flightNumber= flightNumber;
 }
 public String getFlightCapacity(){
  return flightCapacity;
 }
 public void setFlightCapacity(String flightCapacity){
  this.flightCapacity=flightCapacity;
 }
 public String getNumberOfSeats(){
  return numberOfSeats;
 }
 public void setNumberOfSeats(String numberOfSeats){
  this.numberOfSeats=numberOfSeats;
 }
 public String getCurrentCapacity(){
  return currentCapacity;
 }
 public void setCurrentCapacity(String currentCapacity){
  this.currentCapacity=currentCapacity;
 }
 public String getDepLocation(){
  return depLocation;
 }
 public void setDepLocation(String depLocation){
  this.depLocation=depLocation;
 }
 public String getDestLocation(){
  return destLocation;
 }
 public void setDestLocation(String destLocation){
  this.destLocation=destLocation;
 }
 public String getDepDateTime(){
  return depDateTime;
 }
 public void setDepDateTime(String depDateTime){
  this.depDateTime=depDateTime;
 }
 public String getDestDateTime(){
  return destDateTime;
 }
 public void setDestDateTime(String destDateTime){
  this.destDateTime=destDateTime;
 }

}
