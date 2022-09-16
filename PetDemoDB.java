import javax.swing.JOptionPane;
public class PetDemoDB {
	public static void main(String[] args) {
		String input;
		String named;
		String typed;
		int aged;
		boolean isAdopted;
		 JOptionPane.showMessageDialog(null, "Let's make a portifolio of your pet!");


		 // Get the number of hours worked this week.
		 named = JOptionPane.showInputDialog("What is your pets name? ");
		
		 
		 typed = JOptionPane.showInputDialog("What is the type of your pet?");
		 
		 input = JOptionPane.showInputDialog("How old is your pet? ");
		 aged = Integer.parseInt(input);
		 
		 input = JOptionPane.showInputDialog("Is your pet adopted (True or False) ? ");
		 isAdopted = Boolean .parseBoolean(input);

		 JOptionPane.showMessageDialog(null, "Animal name: " + named + "\nAnimal Type: " + typed + "\nAnimal age: " + aged + "\nAnimal adopted: " + isAdopted);

		}
	
}
