package Sum;
import java.util.Scanner;


public class LeetCodePracSum {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        int[] array = new int[size];

	        System.out.println("Enter the elements of the array:");

	        for (int i = 0; i < size; i++) {
	            System.out.print("Enter element " + (i + 1) + ": ");
	            array[i] = scanner.nextInt();
	        }

	        // Displaying the array
	        System.out.println("The elements of the array are:");
	        for (int i = 0; i < size; i++) {
	            System.out.println("Element " + (i + 1) + ": " + array[i]);
	        }
	        
	        System.out.println("Enter Target value: ");
	        int target = scanner.nextInt();
	        
	        
	        
	}

}
