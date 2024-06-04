package Sum;

import java.util.Scanner;

public class Integer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an Integer: ");
		int num = sc.nextInt();
		
		if(num>0) {
			System.out.println(num +" this is positive integer");
		}else if(num<0){
			System.out.println(num +" this is negative integer");
		}else if(num==0){
			System.out.println(num +" this is zero");
			
		}
	}
}
