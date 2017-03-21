import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
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
		/*JDialog dialog = new JDialog((Frame) null, "dialog", true);
		dialog.setSize(300, 200);
		dialog.setLocationRelativeTo(null);
		Graphics g = dialog.getGraphics();
		g.setColor(new Color(0,0,0));
		dialog.paint(g);
		dialog.setBackground(new Color(0,0,0));
		dialog.setVisible(true);*/
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
