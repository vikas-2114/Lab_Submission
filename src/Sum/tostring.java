package Sum;

public class tostring {
	int empcode;
	String city;
	String name;
	
	tostring(int empcode,String city, String name )
	{
		this.empcode=empcode;
		this.city=city;
		this.name=name;
	}
	public String toString()
	{
		return empcode + " " + city + " " + name;
	}
	public static void main(String[] args) {
		tostring emp1 = new tostring(2147,"Lucknow","Shivam");
		System.out.println(emp1);
	}

}
