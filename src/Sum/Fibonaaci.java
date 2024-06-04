package Sum;
import java.util.Scanner;


public class Fibonaaci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int count = 2; // because we have 2 numbers rn
		
		
		while(count<=n) {
			int c=b;
			b= a+b;
			a=c;
			count++;
			
		}
		System.out.println(b);
		

	}

}
