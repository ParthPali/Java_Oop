package run_time_polymorphism;

public class RunTimePolymorphismTest {

	public static void main(String[] args) {
		
		Human obj = new Human();
		

		obj.show();
		
		obj = new Adult();
		obj.show();

	}

}
