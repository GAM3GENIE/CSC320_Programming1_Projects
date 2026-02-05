import java.util.Arrays;

public class Home {
    private int squareFeet;
    private String address;
    private String city;
    private String state;
    private int zipCode;
    private String modelName;
    private String saleStatus; // sold, available, or under contract
    // default constructor
    public Home(){
        try{
            this.squareFeet = 0;
            this.address = "";
            this.city = "";
            this.state = "";
            this.zipCode = 0;
            this.modelName = "";
            this.saleStatus = "available";
        } catch (Exception e) {
            // print out error message
            System.out.println("error in default constructor: " + e.getMessage());
        }
    }
    // parameterized constructor
    public Home(int squareFeet, String address, String city, String state, int zipCode, String modelName, String saleStatus){
        try{
            this.squareFeet = squareFeet;
            this.address = address;
            this.city = city;
            this.state = state;
            this.zipCode = zipCode;
            this.modelName = modelName;
            this.saleStatus = saleStatus;
        } catch (Exception e) {
            System.out.println("error in parameterized constructor: " + e.getMessage());
        }
    }
    // add new home
    public String addHome(int squareFeet, String address, String city, String state, int zipCode, String modelName, String saleStatus){
        try{
            this.squareFeet = squareFeet;
            this.address = address;
            this.city = city;
            this.state = state;
            this.zipCode = zipCode;
            this.modelName = modelName;
            this.saleStatus = saleStatus;
            return "home added successfully";
        } catch (Exception e) {
            return "failed to add home: "+ e.getMessage();
        }
    }
    // clear home details
    public String removeHome(){
        try{
            this.squareFeet = 0;
            this.address = "";
            this.city = "";
            this.state = "";
            this.zipCode = 0;
            this.modelName = "";
            this.saleStatus = "";
            return "home removed successfully";
        } catch (Exception e) {
            return "failed to remove home: " + e.getMessage();
        }
    }
    // update home details
    public String updateHome(int squareFeet, String address, String city, String state, int zipCode, String modelName, String saleStatus){
        try{
            if(squareFeet != 0) this.squareFeet = squareFeet;
            if(address != null) this.address = address;
            if(city != null) this.city = city;
            if(state != null) this.state = state;
            if(zipCode != 0) this.zipCode = zipCode;
            if(modelName != null) this.modelName = modelName;
            if(saleStatus != null) this.saleStatus = saleStatus;
            return "home updated successfully";
        } catch (Exception e) {
            return "failed to update home: " + e.getMessage();
        }
    }
    // print home information to screen
    public String homeInfo(){
        try{
            return "Model: " + modelName +
                    ", Sq Ft: " + squareFeet +
                    ", Address: " + address +
                    ", City: " + city +
                    ", State: " + state +
                    ", Zipcode: " + zipCode +
                    ", Status: " + saleStatus;
        } catch (Exception e) {
            return "error displaying home information: " + e.getMessage();
        }
    }
}
