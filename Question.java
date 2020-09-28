package iVoteSimulatorA1;

public interface Question {

	// To be implemented by multiple choice and single choice question classes
	int QUIZ_SCORE = 50;
	
	public void generateQuestions();
}
