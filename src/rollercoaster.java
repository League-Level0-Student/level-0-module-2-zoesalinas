import javax.swing.JOptionPane;

public class rollercoaster {
public static void main(String[] args) {
	String input=JOptionPane.showInputDialog("How tall are you in inches?");
	int height= Integer.parseInt(input);
	
	if(height>48) {
		JOptionPane.showMessageDialog(null, "You can enter the ride!");
	}
	else { 
		JOptionPane.showMessageDialog(null, "Grow first!");
	}
	}
}

