//  single line
/*
 * Multi Line
 */
/**
 * This class is a demo class just to learn java
 * @author amit
 * @since 
 * @version 0.1
 */
public class FirstDemo {
	/**
	 * 
	 * @param args is arguments of type {@code String}
	 */
	public static void main(String[] args) {
		for(int i = 1; i<=10; i++) {
			for(int j = 1; j<=i; j++) {
				if(i==j) {
					continue;
				}
				System.out.println("I is "+i+" and J is "+j);
			}
		}
//		int a = 10;
//		int b = 20;
//		int c = a + b;
//		System.out.println("Sum is "+c);

	}

}
