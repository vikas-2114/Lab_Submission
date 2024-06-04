package L_Three;

class Personnn{
	private String firstName;
	private String lastName;
	private int age;
	private String email;
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setfirstName(String value) {
		firstName = value;
	}
	
	public void setlastName(String value) {
		lastName = value;
	}
	
	public void setAge(int value) {
		age = value;
	}
	
	public void setEmail(String value) {
		email = value;
	}
}

public class Personn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personnn xyz = new Personnn();
		xyz.setfirstName("Shivam");
		xyz.setlastName("Saroj");	
		xyz.setAge(25);
		xyz.setEmail("shivamsaroj@gmail.com");
		System.out.println(xyz.getFirstName());
		System.out.println(xyz.getLastName());
		System.out.println(xyz.getAge());
		System.out.println(xyz.getEmail());
	}

}
