package kata;

public class Frame {
	private int firstScore;
	private int secondScore;

  
	public int getFirstScore() {
		return firstScore;
	}


	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}


	public int getSecondScore() {
		return secondScore;
	}


	public void setSecondScore(int secondScore) {
		this.secondScore = secondScore;
	}


	public Frame(int firstScore, int secondScore) {
		super();
		this.firstScore = firstScore;
		this.secondScore = secondScore;
	}


	public int getframeScore() { 
		return this.firstScore + this.secondScore; 
	}

  
	public Boolean isStrike() { 
		return this.firstScore == Constants.STRIKESCORE;
	}
  
	public Boolean isSpare() {
		if (this.firstScore != Constants.STRIKESCORE) {
			return getframeScore() == Constants.STRIKESCORE;
		}
		return false;
	}
}
