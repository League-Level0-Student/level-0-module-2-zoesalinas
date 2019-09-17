import javax.swing.JOptionPane;

public class votingBooth {
public static void main(String[] args) {
	String input= JOptionPane.showInputDialog("How old are you in years?");
	int old = Integer.parseInt(input);
	if(old>17) {
		JOptionPane.showInputDialog(null, "Who do you want for president");
	}
	else {
		JOptionPane.showMessageDialog(null, "No one cares what you think!");
	}
	}
	}


