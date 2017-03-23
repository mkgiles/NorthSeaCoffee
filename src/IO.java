import java.util.Scanner;
public class IO {
	public static Scanner scanner = new Scanner(System.in);
	public static String getLine(){
		System.out.print(">");
		return scanner.nextLine();
	}
	public static String getLine(String output){
		System.out.println(output);
		System.out.print(">");
		return scanner.nextLine();
	}
	public static int getInt(){
		System.out.print(">");
		int ans = scanner.nextInt();
		scanner.nextLine();
		return ans;
	}
	
	public static int getInt(String output){
		System.out.println(output);
		System.out.print(">");
		int ans = scanner.nextInt();
		scanner.nextLine();
		return ans;
	}
	
	public static double getDouble(String output){
		System.out.println(output);
		System.out.print(">");
		double ans = scanner.nextDouble();
		scanner.nextLine();
		return ans;
	}
	public static void putLine(String output){
		System.out.println(output);
	}
	public static void prompt(String output){
		System.out.println(output);
		scanner.nextLine();
	}
	public static void printLine(Object output){
		System.out.println(output.toString());
	}
	public static void print(Object output){
		System.out.print(output.toString());
	}
}
