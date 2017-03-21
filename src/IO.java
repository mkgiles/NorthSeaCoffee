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
		dialog.setLocationRelativeTo(null);
		JPanel p = new JPanel();
		dialog.add(p);
		JTextArea text = new JTextArea();
		p.add(text);
		p.setSize(dialog.WIDTH,dialog.HEIGHT);
		p.setBackground(Color.WHITE);
		text.setText(output.toString());
		text.setLocation(p.WIDTH/2, p.HEIGHT/2);
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
