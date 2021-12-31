

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.Scanner;

public class reservationSystem {
    List<Flight> listOfFlights = new ArrayList<Flight>();
    static List<Passenger> passenger = new ArrayList<Passenger>();
    static List<Ticket> ticket = new ArrayList<Ticket>();
    List<String> services = new ArrayList<String>();
    private Address address;


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Please Register Yourself");
        System.out.println("Enter Your EmailId");
        String EmailId = sc.next();
        System.out.println("Enter Your Password");
        String password = sc.next();
        System.out.println("-*- Registered Successfully -*-");

        System.out.println("Enter contact details of passenger - ");
        System.out.println("Name-");
        String Name = sc.next();
        System.out.println("Phone Number-");
        String phoneNumber = sc.next();
        System.out.println("Email Id-");
        String EmailID = sc.next();

        System.out.println("Enter Passenger Address details--");
        System.out.println("Street-");
        String street = sc.next();
        System.out.println("City-");
        String city = sc.next();
        System.out.println("State-");
        String state = sc.next();


        System.out.println("Show available flights");
        Flight flight = new Flight("1", "Indigo", "100", "50", "100", "NewDelhi", "Mumbai", "29-December-2021 at 1:00 PM", "29-December-2021 at 3:00 PM");
        System.out.println("Flight Details -flight Number=" + flight.getFlightNumber() + ", Airline=" + flight.getAirline() +
                ", Flight Capacity=" + flight.getFlightCapacity() + ", Number of seats=" + flight.getNumberOfSeats() +
                " Departure Location = " + flight.getDepLocation() + " Departure Date and time =" + flight.getDepDateTime() +
                " Destination Location =" + flight.getDestLocation() + " Arrival Date & Time" + flight.getDestDateTime() + "]");
        Flight flight1 = new Flight("2", "Vistar", "100", "50", "100", "NewDelhi", "Mumbai", "30-December-2021 at 1:00 PM", "30-December-2021 at 3:00 PM");
        System.out.println("Flight Details -flight Number=" + flight.getFlightNumber() + ", Airline=" + flight.getAirline() +
                ", Flight Capacity=" + flight.getFlightCapacity() + ", Number of seats=" + flight.getNumberOfSeats() +
                " Departure Location = " + flight.getDepLocation() + " Departure Date and time =" + flight.getDepDateTime() +
                " Destination Location =" + flight.getDestLocation() + " Arrival Date & Time" + flight.getDestDateTime() + "]");
        Flight flight2 = new Flight("3", "Indigo", "100", "50", "100", "NewDelhi", "Mumbai", "29-December-2021 at 5:00 PM", "29-December-2021 at 7:00 PM");
        System.out.println("Flight Details -flight Number=" + flight.getFlightNumber() + ", Airline=" + flight.getAirline() +
                ", Flight Capacity=" + flight.getFlightCapacity() + ", Number of seats=" + flight.getNumberOfSeats() +
                " Departure Location = " + flight.getDepLocation() + " Departure Date and time =" + flight.getDepDateTime() +
                " Destination Location =" + flight.getDestLocation() + " Arrival Date & Time" + flight.getDestDateTime() + "]");
        Flight flight3 = new Flight("4", "Indigo", "100", "50", "100", "NewDelhi", "Mumbai", "30-December-2021 at 5:00 PM", "31-December-2021 at 7:00 PM");
        System.out.println("Flight Details -flight Number=" + flight.getFlightNumber() + ", Airline=" + flight.getAirline() +
                ", Flight Capacity=" + flight.getFlightCapacity() + ", Number of seats=" + flight.getNumberOfSeats() +
                " Departure Location = " + flight.getDepLocation() + " Departure Date and time =" + flight.getDepDateTime() +
                " Destination Location =" + flight.getDestLocation() + " Arrival Date & Time" + flight.getDestDateTime() + "]");

        List<String> specialService = new ArrayList<String>();
        specialService.add("Snacks");
        specialService.add("Food");
        specialService.add("water");
        Address address=new Address("abc","def","ghi");
        Regular regular = new Regular(0607,5,"2100","Confirmed",flight,new Passenger("sandy",address),specialService);
        System.out.println("Services availed by passenger="+regular.getSpecialService());

        Address hotelAddress = new Address("Street","Mumbai","Mumbai");
        List<String> TouristLocation = new ArrayList<String>();
        TouristLocation.add("p1");
        TouristLocation.add("p2");

        Tourist t=new Tourist(1001,1,hotelAddress,TouristLocation);
        System.out.println("Location added by passenger= "+t.getTouristLocation());

    System.out.println("print ticket details..");
        printTicketDetails(regular);
        printTicketDetails(t);

    }



   public static void printTicketDetails(Ticket t){
        System.out.println("PNR "+t.getPNR()+ " seatNumber: "+t.getSeatNumber()+" price "+t.price+" status: "+t.status);
    if(t instanceof Tourist){
        System.out.println("hotel address: "+((Tourist)t).getHotelAddress().getStreet()+" tourist location: "+((Tourist)t).getTouristLocation());
    }
    if(t instanceof Regular){

        System.out.println("services offered: "+((Regular)t).getSpecialService());
                    }
    }
}