package iVoteSimulatorA1;


public class SimulationDriver {

	// Driver class with main method to trigger whole process
	
	public static void main(String[] args) {
		System.out.println("Welcome to iVote Simulator! Students Playing:\n");
		VotingService vs = new VotingService();
		vs.initiateQuiz();
	}
	
}
