package Sum;

import java.util.Scanner;

public class leapWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boolean leap=true;
		
			while(leap) {
			System.out.print("Enter a year: ");
			int num=sc.nextInt();
			if(num%4==0 && num%100 != 0 || num%400==0 ) {
				System.out.println(num+" this is leap year");	
			} else {
				System.out.println(num+" this is not leap year");
			}
		}
	}

}
