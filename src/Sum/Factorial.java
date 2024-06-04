package Sum;
import java.util.Scanner;


public class Factorial {
	int fact=1; 

	public static void main(String[] args) {
		
		int res;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		Factorial f=new Factorial();
		res=f.calFact(num);
		System.out.println(res);

	}
	int calFact(int num)
	{

		if(num>1) {
			fact=fact*num;
			calFact(num-1);
			
		}	
		return fact;
		
	}
	
}
