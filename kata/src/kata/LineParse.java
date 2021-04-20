package kata;

public class LineParse {
	private String line;
	  
	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public LineParse(String line) {
		super();
		this.line = line;
	}

	public int getLineScore() throws Exception {
	    ScoreService scoreService = new ScoreService();
	    return scoreService.getTotalScore(this.line);
	}
}
