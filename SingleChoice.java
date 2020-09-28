package iVoteSimulatorA1;

import java.util.Hashtable;

public class SingleChoice implements Question {
	
	Hashtable<String, String> questions = new Hashtable<String, String>(); // hashtable of Question, Answer
	String[] questionsArray = new String[10]; // array of questions to randomly select question for future
	
	
	@Override
	public void generateQuestions() {
		int count = 0;
		String question = "How many states are in the United States?";
		String answer = "50";
		questionsArray[count++] = question;
		questions.put(question,answer);
		
		question = "Which teams made it to the NBA Finals this year?";
		answer = "Lakers and Heat";
		questionsArray[count++] = question;
		questions.put(question,answer);
		
		question = "How many teams are in the NBA?";
		answer = "30";
		questionsArray[count++] = question;
		questions.put(question,answer);
		
		question = "What chemicals are water made of?";
		answer = "Hydrogen and Oxygen";
		questionsArray[count++] = question;
		questions.put(question,answer);
		
		question = "What is the hottest month of the year?";
		answer = "September";
		questionsArray[count++] = question;
		questions.put(question,answer);
		
		question = "What colors make up the color green?";
		answer = "Blue and yellow";
		questionsArray[count++] = question;
		questions.put(question,answer);
		
		question = "What is the largest continent?";
		answer = "Antarctica";
		questionsArray[count++] = question;
		questions.put(question,answer);
		
		question = "Who is the president of the United States?";
		answer = "Donald Trump";
		questionsArray[count++] = question;
		questions.put(question,answer);
		
		question = "Who was the former vice president of the United States?";
		answer = "Joe Biden";
		questionsArray[count++] = question;
		questions.put(question,answer);
		
		question = "Which city is CPP located in?";
		answer = "Pomona";
		questionsArray[count++] = question;
		questions.put(question,answer);
		
	}

}
