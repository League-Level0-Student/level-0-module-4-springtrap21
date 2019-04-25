package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		//String snipes = JOptionPane.showInputDialog("What kind of pet do you want? TELL ME!");
		String[] pets;
		int petChoice = JOptionPane.showOptionDialog(null, "What pet do you want?", "Pet Chooser", 0, JOptionPane.INFORMATION_MESSAGE, null,
				pets = new String[] { "Dog","Cat","hipi" }, null);
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		while (happinessLevel < 50 ) {
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "CHOOSE A TASK!!!", "THE TASKS!!!", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Clean dat poop ", "Feed dat " + pets[petChoice], " Walk dat " + pets[petChoice] }, null);
			System.out.println(task);
			// 5. Use user input to call the appropriate method created in step 4.
			if (task == 0) {
				poop();
			}
			else if (task == 1) {
				feed();
			}
			else if (task == 2) {
				walk();
			}
	}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			
				JOptionPane.showMessageDialog(null, "Your pet loves you!...");
			
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void poop () {
		JOptionPane.showMessageDialog(null, "Nice and clean");
		happinessLevel += 10;
	}
	static void feed () {
		JOptionPane.showMessageDialog(null, "Oh Yeah Yummy");
		happinessLevel += 10;
	}	

	static void  walk() {
	JOptionPane.showMessageDialog(null, "Thank you");
	happinessLevel += 10;
	}
}