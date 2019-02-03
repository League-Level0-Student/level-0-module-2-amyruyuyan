package methods;

import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
String height = 
	JOptionPane.showInputDialog("what is your height in inches?");
	int rollercoaster = Integer.parseInt(height);
	if (rollercoaster > 48) {
	JOptionPane.showMessageDialog(null, "You are tall enough to go on the rollercoaster");
	}
	else {
	JOptionPane.showMessageDialog(null, "You are too short to go on this rollercoaster. You have to grow some more.");	
	}
}
}
