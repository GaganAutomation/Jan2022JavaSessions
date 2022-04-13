package javasession;

public class IncrementAndDecrementalOperators {

	public static void main(String[] args) {

		//1. post increment:
		
		int a = 1;
		int b = a++;
		System.out.println(a);//2
		System.out.println(b);//1
		
		int c = -99;
		int d = c++;
		System.out.println(d);//-99
		System.out.println(c);//-98
		
		//2. pre increment
		
		int h = 1;
		int g = ++h;
		System.out.println(h);//2
		System.out.println(g);//2

		int p = -198;
		int q = ++p;
		System.out.println(p);//-197
		System.out.println(q);//-197
		
		//3. post decrement:
		
		int m = 2;
		int n = m--;
		System.out.println(n);//2
		System.out.println(m);//1
		
		
		//4. pre decrement:
		
		int u = 2;
		int y = --u;
		System.out.println(u);//1
		System.out.println(y);//1
		
		int s = 1;
		System.out.println(s++);//1
		System.out.println(s);//2
		
	}

}
