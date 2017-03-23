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
	
	public static double getDouble(String output){
		System.out.println(output);
		System.out.print(">");
		double ans = scanner.nextDouble();
		scanner.nextLine();
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
	public static JDialog print(Object output){
		JDialog dialog = new JDialog((Frame) null, "dialog");
		dialog.setSize(300, 200);
		dialog.setLocation(0, 0);
		JPanel p = new JPanel();
		dialog.add(p);
		JTextArea text = new JTextArea();
		p.add(text);
		p.setBackground(Color.WHITE);
		text.setText(output.toString());
		text.setOpaque(false);
		dialog.pack();
		dialog.setVisible(true);
		return dialog;
	}
	public static void delete(Object window){
		if(window!=null){
			JDialog dialog = (JDialog) window;
			dialog.dispose();
		}
	}
}
