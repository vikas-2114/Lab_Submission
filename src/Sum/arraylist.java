package Sum;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		
		ArrayList<String> colorlist = new ArrayList<String>(2);
		colorlist.add("Red");
		colorlist.add("Blue");
		
		
		for(String value: colorlist) {
			System.out.println("Value from arraylist: "+ value);
		}
		Object[] obj = colorlist.toArray();
		for(Object value: obj) {
			System.out.println("Value from array: "+ value);

		
	}

}
}
