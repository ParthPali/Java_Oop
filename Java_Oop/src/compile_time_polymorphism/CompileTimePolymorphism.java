package compile_time_polymorphism;

public class CompileTimePolymorphism {

	public static void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		add(10, 9, 8);
		add(10, 9);
		
	}

}
