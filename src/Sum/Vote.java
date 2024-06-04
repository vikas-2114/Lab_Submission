package Sum;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		
		if(age>=18) {
			System.out.println("You are eligilbe for voting");
		}else {
			System.out.println("You are not eligilbe for voting");
		}
		

	}

}
