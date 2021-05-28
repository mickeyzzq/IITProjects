/**
 * @author Zhu Zhiqiang
 * @date 2020.05.28
 */
public class Lab1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Zhu Zhiqiang");
		System.out.println("I like to make interesting toys and play with children in my spare time.");
		
		// Call the mothods
		int sum = add7(10);
		System.out.println(sum);
		
		String greeting = createGreeting("World!");
		System.out.println(greeting);
	}

	private static int add7(int addend) {
		// add seven
		return addend + 7;
	}
	
	private static String createGreeting(String string) {
		// TODO Auto-generated method stub
		return "Hello " + string;
	}
}
