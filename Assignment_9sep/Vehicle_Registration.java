package Assignment_9sep;
class Vehicle{
    String ownerName;
    String vehicleType;
    static int registrationFee=10000;

    Vehicle(String ownerName, String vehicleType){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
    }
    void displayVehicleDetails(){
        System.out.println(ownerName+" "+vehicleType+" "+Vehicle.registrationFee);
    }
   static void updateRegistrationFee(){
        registrationFee=5000;
       System.out.println("Updated fees: "+Vehicle.registrationFee);
    }
}
public class Vehicle_Registration {
    public static void main(String[] args) {
        Vehicle v1=new Vehicle("Abhishek","Fortuner");
        Vehicle v2=new Vehicle("Anurag","Innova");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee();

    }
}
