package java_basics;

public class MyUtils {

	public static String printSomeJunk(String argument) {
		String result = argument;
		return result;
	}
	
	public static void printSomeJunk(int argument) {
		System.out.println("Integer passed in: " + argument);
	}
	
	public static void sum2Numbers(int firstArg, int secondArg) {
		System.out.println(firstArg+secondArg);
	}
	
	public int add10(int someArgument) {
		int result = someArgument+10;
		return result;
	}
}
