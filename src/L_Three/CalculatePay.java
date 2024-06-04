package L_Three;


public class CalculatePay {

	public static void main(String[] args) {
		
		Employee Vikas = new SalariedEmployee("vikas", 232, 65000);
		System.out.println("The salary of employee: "+Vikas.calculatePay());
		
		System.out.println("   ");
		
		Employee vikas = new HourlyEmployee("shivam", 230, 50, 20);
		System.out.println("The salary of employee: "+vikas.calculatePay());

	}

}
abstract class Employee{
	String name;
	int empID;
	
	public Employee(String name, int empID){
		this.name=name;
		this.empID=empID;
	}
	abstract double calculatePay();
}


class SalariedEmployee extends Employee{
	double annualSalary;
	public SalariedEmployee(String name, int empID, double annualSalary){
		super(name, empID);
		this.annualSalary=annualSalary;
		
	}
	double calculatePay() {
	System.out.println("Employee name: "+super.name);
	System.out.println("Employee ID: "+super.empID);
	return annualSalary/12;
}}

class HourlyEmployee extends Employee{
	int hourlyWorked;
	double hourlyRate;
	public HourlyEmployee(String name, int empID, int hourlyWorked, double hourlyRate) {
		super(name, empID);
		this.hourlyWorked=hourlyWorked;
		this.hourlyRate=hourlyRate;
	}
	double calculatePay() {
		System.out.println("Employee name: "+super.name);
		System.out.println("Employee ID: "+super.empID);
		return hourlyRate*hourlyWorked;
	}
}