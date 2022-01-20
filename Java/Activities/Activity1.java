package Activities;

public class Activity1 {
    public static void main(String[] args){
        Car carname = new Car();
        carname.make = 2018;
        carname.color = "Blue";
        carname.transmission = "Automatic";

        carname.displayCharacteristics();
        carname.accelerate();
        carname.brake();
    }


}
