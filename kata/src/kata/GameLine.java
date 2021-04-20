package kata;

import java.util.ArrayList;

public class GameLine {
	private ArrayList<Frame> frameList;
	public static final int MAX_NUMBER_OF_FRAMES = 10;
	
  
	public ArrayList<Frame> getFrameList() {
		return frameList;
	}

	public void setFrameList(ArrayList<Frame> frameList) {
		this.frameList = frameList;
	}
	

	public GameLine(ArrayList<Frame> frameList) {
		super();
		this.frameList = frameList;
	}

	public int getGameLineScore() {
		int result = 0;
		for (int i = 0; i < MAX_NUMBER_OF_FRAMES; i++) {
			Frame frame = getFrameList().get(i);
			result += frame.getframeScore();
			if (frame.isStrike() || frame.isSpare()) {
				result += getBonusScoreForFrame(frame, i);
			}
		} 
		return result;
	}
	
	public int getBonusScoreForFrame(Frame frame, int frameIndex) {
	    int bonusResult = 0;
	    Frame nextFrame = getFrameList().get(frameIndex + 1);
	    if (frame.isStrike()) {
	    	bonusResult += nextFrame.getframeScore();
	    	if (nextFrame.isStrike()) {
	    		bonusResult += getFrameList().get(frameIndex + 2).getFirstScore();
	    	}
	    } 
	    if (frame.isSpare()) {
	    	bonusResult += nextFrame.getFirstScore();
	    }
	    return bonusResult;
	  }
}
