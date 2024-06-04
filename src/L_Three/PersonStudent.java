package L_Three;

public class PersonStudent {

	public static void main(String[] args) {
		
		 Student vikas = new Student("Shivam",23,45);
	        vikas.display();

	    }
	}

	   class Person {
	    String name;
	    int age;

	    Person(String name, int age){
	        this.name=name;
	        this.age=age;
	    }
	    public void display(){
	        System.out.println("name: "+ name);
	        System.out.println("age: "+ age);

	       }
	    }

	  class Student extends Person{

	    int studentID;

	    Student(String name, int age, int studentID){
	        super(name,age);
	        this.studentID=studentID;

	    }
	    public void display() {
	        System.out.println("id: " + studentID);
	        super.display();

	}

}
