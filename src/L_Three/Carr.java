package L_Three;

class Carrr{
	private String make;
	private String model;
	private int year;
	private String color;
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setMake(String value) {
		make = value;
	}
	
	public void setModel(String value) {
		model = value;
	}
	
	public void setYear(int value) {
		year = value;
	}
	
	public void setColor(String value) {
		color = value;
	}
}

public class Carr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carrr car = new Carrr();
		car.setMake("Tata");
		car.setModel("Nexon");	
		car.setYear(2020);
		car.setColor("Blue");
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		System.out.println(car.getColor());

	}

}
