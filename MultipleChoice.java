package iVoteSimulatorA1;

public class MultipleChoice implements Question {
	
	String[][] questions = new String[10][3]; 
	// 2D array containing questions in first column, answer 1 in second column, and answer 2 in third column
	
	@Override
	public void generateQuestions() {
		int count = 0;
		
		String question = "What factors make up the number 6?";
		String answer1 = "3";
		String answer2 = "2";
		questions[count][0] = question;
		questions[count][1] = answer1;
		questions[count++][2] = answer2;
		
		question = "Which words are homophones?";
		answer1 = "Phase";
		answer2 = "Faze";
		questions[count][0] = question;
		questions[count][1] = answer1;
		questions[count++][2] = answer2;

		question = "What ingredients go in a rootbeer float?";
		answer1 = "Root Beer";
		answer2 = "Ice Cream";
		questions[count][0] = question;
		questions[count][1] = answer1;
		questions[count++][2] = answer2;
		
		question = "Which two cities are capitols?";
		answer1 = "Hartford";
		answer2 = "Albany";
		questions[count][0] = question;
		questions[count][1] = answer1;
		questions[count++][2] = answer2;
		
		question = "Which two cities are capitols?";
		answer1 = "Sacremento";
		answer2 = "Boise";
		questions[count][0] = question;
		questions[count][1] = answer1;
		questions[count++][2] = answer2;
		
		question = "Which colors make purple?";
		answer1 = "Blue";
		answer2 = "Red";
		questions[count][0] = question;
		questions[count][1] = answer1;
		questions[count++][2] = answer2;
		
		question = "Which temperature(s) are the point of freezing?";
		answer1 = "0 degrees C";
		answer2 = "32 degrees F";
		questions[count][0] = question;
		questions[count][1] = answer1;
		questions[count++][2] = answer2;
		
		question = "What is a yard equal to? ";
		answer1 = "3 feet";
		answer2 = "36 inches";
		questions[count][0] = question;
		questions[count][1] = answer1;
		questions[count++][2] = answer2;
		
		question = "What colors make orange? ";
		answer1 = "Red";
		answer2 = "Yellow";
		questions[count][0] = question;
		questions[count][1] = answer1;
		questions[count++][2] = answer2;
		
		question = "What colors make pink? ";
		answer1 = "White";
		answer2 = "Red";
		questions[count][0] = question;
		questions[count][1] = answer1;
		questions[count][2] = answer2;
	}

}
