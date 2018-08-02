package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int score = 0;
		// 2. Ask the user a question
		String answer = JOptionPane.showInputDialog(
				"What is the first name of Percy's best friend at the start of The Lightning Thief?");
		// 3. Use an if statement to check if their answer is correct
		if (answer.equals("Grover")) {

			// 4. if the user's answer is correct

			// -- add one to their score
			score++;
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			score--;
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		// 5. Create more questions by repeating steps 1, 2, and 3 below.
		String answer1 = JOptionPane.showInputDialog(
				"What was the first name of the boy that blamed Percy for his sister's death in The Titan's Curse?");
		if (answer1.equals("Nico")) {
			score++;
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			score--;
			JOptionPane.showMessageDialog(null, "Incorrect");
		}

		String answer2 = JOptionPane.showInputDialog("What was the first name of the traitor that was helping Kronos?");
		if (answer2.equals("Luke")) {
			score++;
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			score--;
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		
		String answer3 = JOptionPane.showInputDialog("What was the first name of the girl who was the head of the Ares cabin?");
		if(answer3.equals("Clarisse")) {
			score++;
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			score--;
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		
		String answer4 = JOptionPane.showInputDialog("What is the name of the daughter of Atlas that was exiled to Ogygia?");
		if(answer4.equals("Calypso")) {
			score++;
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			score--; 
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		// 6. After all the questions have been asked, print the user's score
JOptionPane.showMessageDialog(null, "Your score is " + score);
	}
}
