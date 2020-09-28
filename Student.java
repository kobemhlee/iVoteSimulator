package iVoteSimulatorA1;

public class Student {
	
	private String id;
	private int score;
	
	public Student(String id) {
		this.id = id;
		score = 0;
	}

	public int getScore() {
		return score;
	}

	public void addScore() {
		score++;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String toString() {
		return id;
	}
	
}
