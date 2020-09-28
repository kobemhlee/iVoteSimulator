package iVoteSimulatorA1;
import java.lang.Math; 

public class VotingService {

	public void initiateQuiz() {
		// Generate 10 students 
		Student john = new Student("John");
		System.out.println(john);
		Student rob = new Student("Rob");
		System.out.println(rob);
		Student jessie = new Student("Jessie");
		System.out.println(jessie);
		Student danny = new Student("Danny");
		System.out.println(danny);
		Student roger = new Student("Roger");
		System.out.println(roger);
		Student annie = new Student("Annie");
		System.out.println(annie);
		Student abby = new Student("Abby");
		System.out.println(abby);
		Student duke = new Student("Duke");
		System.out.println(duke);
		Student jed = new Student("Jed");
		System.out.println(jed);
		Student anna = new Student("Anna");
		System.out.println(anna);
		Student[] students = new Student[]{john, rob, jessie, danny, roger, annie, abby, duke, jed, anna};
		
		int rand;
		
		// Generate 5 random questions from list (with associated answers)
		SingleChoice sc = new SingleChoice();
		sc.generateQuestions();
		MultipleChoice mc = new MultipleChoice();
		mc.generateQuestions();
				
		String[] randomQuestions = new String[5]; // list of final questions
		String[] randomQuestionsMCSC = new String[5]; // associated list of whether multiple or single choice
		for (int i = 0; i<5;i++) {
			if ((int)(Math.random()*10) > 4) {
				rand = (int)(Math.random()*10);
				randomQuestions[i] = sc.questionsArray[rand];
				randomQuestionsMCSC[i] = "sc";
			}
			else {
				rand = (int)(Math.random()*10);
				randomQuestions[i] = mc.questions[rand][0];
				randomQuestionsMCSC[i] = "mc";
			}
		}
		
		
		
		// Ask one question at a time, randomize each student's answer (and randomize switches)
		// Display correct answer, record statistics
		int aCounter;
		int bCounter;
		int cCounter;
		int dCounter;
		
		
		for (int i = 0; i<5;i++) {	
			aCounter = 0;
			bCounter = 0;
			cCounter = 0;
			dCounter = 0;
			// reset counters
			
			System.out.println("\n"+randomQuestions[i]);
			
			int correct = (int)(Math.random()*4);
			
			
			for (int s = 0; s<10; s++) {
				rand = (int)(Math.random()*4);
				
				if (rand == correct) {
					students[s].addScore();
				}
				
				if (rand==0) {
					aCounter++;
				}
				if (rand==1) {
					bCounter++;
				}
				if (rand==2) {
					cCounter++;
				}
				if (rand==3) {
					dCounter++;
				}
			}

			 // Ff question is multiple choice
			if (randomQuestionsMCSC[i] == "mc") {
				System.out.println("Correct answers: ");
				int correct2 = (int)(Math.random()*4);
				if (correct2 == correct) {
					if (correct2 == 4) {
						correct2--;
					}
					else
						correct2++;
				}
				
				
				aCounter *= 2;
				bCounter *= 2;
				cCounter *= 2;
				dCounter *= 2;
				
				int switcher = 0;
				
				int mcQuestionsIndex = 0;
				// find the corresponding index in the mc questions array for the random question at hand
				
				for (int ind = 0; ind <10; ind++) {
					if (mc.questions[ind][0].equals(randomQuestions[i]))
						mcQuestionsIndex = ind;
				}
				
				if (correct==0 || correct2 == 0) {
					System.out.print("A - ");
					if (switcher == 0) {
						System.out.print(mc.questions[mcQuestionsIndex][1] + " ");
						switcher++;
					}
					else {
						System.out.print(mc.questions[mcQuestionsIndex][2] + " ");
					}
				}
				if (correct==1 || correct2 == 1) {
					System.out.print("B - ");
					if (switcher == 0) {
						System.out.print(mc.questions[mcQuestionsIndex][1] + " ");
						switcher++;
					}
					else {
						System.out.print(mc.questions[mcQuestionsIndex][2] + " ");
					}
				}
				if (correct==2 || correct2 == 2) {
					System.out.print("C - ");
					if (switcher == 0) {
						System.out.print(mc.questions[mcQuestionsIndex][1] + " ");
						switcher++;
					}
					else {
						System.out.print(mc.questions[mcQuestionsIndex][2] + " ");
					}
				}
				if (correct==3 || correct2 == 3) {
					System.out.print("D - ");
					if (switcher == 0) {
						System.out.print(mc.questions[mcQuestionsIndex][1] + " ");
						switcher++;
					}
					else {
						System.out.print(mc.questions[mcQuestionsIndex][2] + " ");
					}
				}
			
				
				System.out.println("\nA: "+aCounter+", B: "+bCounter+", C: "+cCounter+", D: "+dCounter);
			}
			else { // if is of type "single choice"
				System.out.println("Correct answer: ");
				if (correct==0) {
					System.out.print("A - ");
				}
				if (correct==1) {
					System.out.print("B - ");
				}
				if (correct==2) {
					System.out.print("C - ");
				}
				if (correct==3) {
					System.out.print("D - ");
				}
				System.out.print(sc.questions.get(randomQuestions[i]) + " ");
				System.out.println("\nA: "+aCounter+", B: "+bCounter+", C: "+cCounter+", D: "+dCounter);
			}
		}
		
		int indexBestStudent = 0;
		int bestStudentVal = 0;
		for (int s = 0; s<10; s++) {
			if (students[s].getScore() > bestStudentVal) {
				indexBestStudent = s;
				bestStudentVal = students[s].getScore();
			}
		}
		
		// Print out student with best score out of maximum score
		System.out.println("\nBest performing student: " + students[indexBestStudent]);
		System.out.println("Score: " + students[indexBestStudent].getScore()*10 + "/" + Question.QUIZ_SCORE);
	}
}
