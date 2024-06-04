package L_Three;

public class VehicleMove {

	public static void main(String[] args) {
		
		 Car car = new Car();
	        Bike bike = new Bike();

	       car.move();
	       bike.move();
		

	}

}
class Vehicle{
    void move(){
        System.out.println("Vehicles are moving");
        return;
    }
}
class Car extends Vehicle{
}

class Bike extends Vehicle{

}