package iVoteSimulatorA1;


public class SimulationDriver {

	// Driver class with main method to trigger whole process
	public static void main(String[] args) {
		System.out.println("Welcome to iVote Simulator! Students Playing:\n");
		VotingService vs = new VotingService();
		Student john = new Student("John");
		Student rob = new Student("Rob");
		Student jessie = new Student("Jessie");
		Student danny = new Student("Danny");
		Student roger = new Student("Roger");
		Student annie = new Student("Annie");
		Student abby = new Student("Abby");
		Student duke = new Student("Duke");
		Student jed = new Student("Jed");
		Student anna = new Student("Anna");
		Student[] studentsGen = new Student[]{john, rob, jessie, danny, roger, annie, abby, duke, jed, anna};
		vs.initiateQuiz(studentsGen);
	}
	
}
