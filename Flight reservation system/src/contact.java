public class contact {


    private String Name;
    private String phoneNumber;
    private String EmailID;


    public contact(String Name,String phoneNumber ,String EmailID) {
        this.Name=Name;
        this.phoneNumber=phoneNumber;
        this.EmailID=EmailID;


    }
    public String getName(){
        return Name;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getEmailID(){
        return EmailID;
    }


}


