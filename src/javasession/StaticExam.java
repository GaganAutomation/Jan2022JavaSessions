package javasession;

public class StaticExam {
	
	static int i = 85;

	static {
		System.out.println(i);
		System.out.println("first static block");
		
	}
	
	public static void main(String[] args) {
		m1();
	}
	
	public static void m1() {
		System.out.println(i);
	}
	
}
