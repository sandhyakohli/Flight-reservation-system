import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class reservationSystem {


    public static void main(String args[]){

        Address address = new Address ("S1", "New Delhi", "New Delhi");
        System.out.println("Address -street=" + address.getStreet() + ", city=" + address.getCity()+ ", state=" + address.getState() +"]");

        Address address2 = new Address("S2","Pune","Maharashtra");
        System.out.println("Address -street="+address2.getStreet()+", city="+address2.getCity()+", state="+address2.getState()+"]");


        Flight flight = new Flight("321","Indigo","100","50","100","NewDelhi","Mumbai","29-December-2021 at 1:00 PM","29-December-2021 at 3:00 PM");
        System.out.println("Flight Details -flight Number=" + flight.getFlightNumber() + ", Airline=" + flight.getAirline() +
                ", Flight Capacity=" + flight.getFlightCapacity() +", Number of seats=" + flight.getNumberOfSeats()+
                " Departure Location = " +flight.getDepLocation() + " Departure Date and time ="+flight.getDepDateTime()+
                " Destination Location ="+ flight.getDestLocation()+" Arrival Date & Time"+flight.getDestDateTime()+"]");

        Passenger passenger =new Passenger("abc",address);
        System.out.println("Id of Passenger="+passenger.getPassengerCount()+ " Password="+passenger.getPassword());

        List<String> specialService = new ArrayList<String>();
        specialService.add("Snacks");
        specialService.add("Food");
        specialService.add("water");
        Regular regular = new Regular("0607","5","2100","Confirmed",flight,passenger,specialService);
        System.out.println("Services availed by passenger="+regular.getSpecialService());

        Address hotelAddress = new Address("Street","Mumbai","Mumbai");
        List<String> TouristLocation = new ArrayList<String>();
        TouristLocation.add("p1");
        TouristLocation.add("p2");
        Tourist t=new Tourist(1001,1,address,TouristLocation);
        System.out.println("Location added by passenger= "+t.getTouristLocation());

    }

}
