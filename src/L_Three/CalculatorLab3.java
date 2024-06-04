package L_Three;

public class CalculatorLab3 {

	public static void main(String[] args) {
		
		AdvanceCalculator add = new AdvanceCalculator();
        System.out.println(add.add(5,5,5));

	}

}
class Calculator{
    int a, b;

    public int add(int a, int b){
        return a+b;
    }
 }

 class AdvanceCalculator extends Calculator {
     int c;

     public int add(int a, int b, int c) {
         return super.add(a,b)+c;
     }

          }