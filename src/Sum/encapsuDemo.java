package Sum;

public class encapsuDemo {
	
	private int empId;
	private int empAge;
	private String empName;

	public String getEmpName() {
		return empName;
	}

	public int getEmpId() {
		return empId;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int value) {
		empAge = value;
	}

	public void setEmpId(int value) {
		empId = value;
	}

	public void setEmpName(String value) {
		empName = value;
	}


	public static void main(String[] args) {
		
		encapsuDemo obj = new encapsuDemo();
		obj.setEmpAge(28);
		obj.setEmpId(12112);
		obj.setEmpName("Shivam");
		System.out.println(obj.getEmpAge());
		System.out.println(obj.getEmpId());
		System.out.println(obj.getEmpName());

		

	}

}
