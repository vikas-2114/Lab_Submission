package Sum;

import java.util.Scanner;

public class GreaterNum {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
		 System.out.print("Enter two numbers: ");
	        int a = in.nextInt();
	        int b = in.nextInt();
	        
	        int max = Math.max(a, b);
	        System.out.println(max);

	}

}
