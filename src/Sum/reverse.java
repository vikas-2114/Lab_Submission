package Sum;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num= sc.nextInt();
		int res=0;
		while(num>0) {
			int rem = num%10;
			res = res*10 + rem;
			num/=10;
		}
		System.out.println(res);

	}

}
