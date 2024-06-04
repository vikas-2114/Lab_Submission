package Sum;

import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num= sc.nextInt();
		int a;
		for(a=1; a<=10; a++) {
			System.out.println(num*a);
		}
	}
}
