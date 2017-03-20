import java.util.Scanner;
import javax.swing.*;
public class IO {
	public static Scanner scanner = new Scanner(System.in);
	public static String getLine(){
		System.out.print(">");
		return scanner.nextLine();
	}
	public static String getLine(String output){
		String input = JOptionPane.showInputDialog(null, output);
		return input;
	}
	public static int getInt(){
		System.out.print(">");
		int ans = scanner.nextInt();
		scanner.nextLine();
		return ans;
	}
	public static int getInt(String output){
		String input = JOptionPane.showInputDialog(null, output);
		int ans = Integer.parseInt(input);
		return ans;
	}
	public static void putLine(String output){
		JOptionPane.showMessageDialog(null, output, "alert", JOptionPane.INFORMATION_MESSAGE);
	}
	public static void prompt(String output){
		putLine(output);
	}
	public static void printLine(Object output){
		JOptionPane.showMessageDialog(null, output.toString(), "alert", JOptionPane.INFORMATION_MESSAGE);
	}
	public static void print(Object output){
		System.out.print(output.toString());
	}
}
