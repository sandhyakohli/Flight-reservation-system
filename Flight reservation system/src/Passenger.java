public class Passenger {
    private   static int idCounter;
    private int id;
    private String password;
    private Address address;
    private contact Contact;


    public Passenger(String password , Address address) {
        this.password = password;
        this.address=address;
        this.Contact=Contact;

        this.id = idCounter;
        idCounter++;
    }
    public int getPassengerCount( ){
        return id;
    }

    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public Address getAddress(){
        return address;
    }
    public contact getContact(){
        return Contact;
    }
    public int ID(){
        return id;
    }
    public static int getIdCounter(){
        return idCounter;
    }





}








