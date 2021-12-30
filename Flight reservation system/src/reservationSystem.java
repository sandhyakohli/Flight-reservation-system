import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class reservationSystem {


    public static void main(String args[]){

        Address address1 = new Address ("S1", "New Delhi", "New Delhi");
        System.out.println("Address -street=" + address1.street + ", city=" + address1.city + ", state=" + address1.state +"]");

        Address address2 = new Address("S2","Pune","Maharashtra");
        System.out.println("Address -street="+address2.street+", city="+address2.city+", state="+address2.state+"]");

        contact Contact = new contact("sandhya","123","sandy@gmail.com");
                System.out.println("Contact -Name=" + Contact.Name + ", Phone number=" + Contact.phoneNumber + ", Email ID=" + Contact.EmailID + "]");

       Flight flight = new Flight("321","Indigo","100","50","100","NewDelhi","Mumbai","29-December-2021 at 1:00 PM","29-December-2021 at 3:00 PM");
        System.out.println("Flight Details -flight Number=" + flight.flightNumber + ", Airline=" + flight.airline +
                ", Flight Capacity=" + flight.flightCapacity +", Number of seats=" + flight.numberOfSeats+
                " Departure Location = " +flight.depLocation + " Departure Date and time ="+flight.depDateTime+
                " Destination Location ="+ flight.destLocation+" Arrival Date & Time"+flight.destDateTime+"]");

        Passenger passenger =new Passenger("abc");
        System.out.println("Id of Passenger="+passenger.id+ " Password="+passenger.password);

        List<String> specialService = new ArrayList<String>();
        specialService.add("Snacks");
        specialService.add("Food");
        specialService.add("water");
        Regular regular = new Regular("0607","5","2100","Confirmed",specialService);
        System.out.println("Services availed by passenger="+regular.getSpecialService());

        Address hotelAddress = new Address("Street","Mumbai","Mumbai");
        List<String> TouristLocation = new ArrayList<String>();
        TouristLocation.add("p1");
        TouristLocation.add("p2");
        Tourist t=new Tourist(1001,1,address1,TouristLocation);
        System.out.println("Location added by passenger= "+t.getTouristLocation());

        }

}
