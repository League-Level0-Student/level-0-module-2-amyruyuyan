package methods;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
String age =
JOptionPane.showInputDialog("What is your age in years?");
int voting = Integer.parseInt(age);
if (voting >= 18) {
	JOptionPane.showMessageDialog(null, "who do you think should be the next president?");
}
else {
	JOptionPane.showMessageDialog(null, "Nobody cares about your opinion because you are too young to vote.");
}
}
}
