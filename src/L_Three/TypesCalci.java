package L_Three;

class Calculatorr{
	int a,b,c;


Calculatorr(){}
	public int add(int a, int b){
		return a+b;	
}

public double add(double a, double b) {
	return a+b ;
	
}
public int add(int a, int b, int c){
	return a+b+c;	

}
}

public class TypesCalci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculatorr calci = new Calculatorr();
		System.out.println("Sum of two integer: "+calci.add(5,5));
		System.out.println("Sum of two double: "+calci.add(4.5,5.5));
		System.out.println("Sum of three integer: "+calci.add(4, 1, 5));
	}}


