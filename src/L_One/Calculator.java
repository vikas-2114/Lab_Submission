package L_One;

import java.util.Scanner;

public class Calculator {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
	        int ans = 0;
	        while (true){
	            System.out.print("Enter operators = ");
	            char op = in.next().trim().charAt(0);
	            if (op == '+' || op == '-' || op == '*' || op=='/' || op=='%') {
	                System.out.println("Enter numbers: ");
	                int num1 = in.nextInt();
	                int num2 = in.nextInt();
	                if (op == '+') {
	                    ans = num1 + num2;
	                }
	                if (op == '-') {
	                    ans = num1 - num2;
	                }
	                if (op == '*') {
	                    ans = num1 * num2;
	                }
	                if (op == '/') {
	                    if (num2 != 0) {
	                    	ans = num1 / num2;
	                    }
	                }
	                if (op == '%') {
	                    ans = num1 % num2;
	                }
	                }else if (op=='X' || op=='x') {
	                break;
	                }else  {
	                	System.out.println("Invalid Operation");
	            }
	            System.out.println(ans);

	       }
		}

	}

