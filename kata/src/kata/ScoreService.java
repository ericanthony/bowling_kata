package kata;

import java.util.ArrayList;

public class ScoreService {
	  
	public int getTotalScore(String framesWithoutBonus) throws Exception {
	    ArrayList<Integer> rollsResult = new ArrayList<Integer>();
	    ArrayList<Frame> frameList = new ArrayList<Frame>();

	    for (int i = 0; i < framesWithoutBonus.length(); i++) {
	    	char roll = framesWithoutBonus.charAt(i);
	    	if (roll == Constants.SPARE) {
	    		rollsResult.add(getSpareScoreOf(framesWithoutBonus.charAt(i - 1)));
	    	} else {
	    		rollsResult.add(getScoreOf(roll));
	    	} 
	    }
	    
	    int rollNb = 0;
	    while (rollNb < rollsResult.size()) {
	    	try {
		        Frame frame;
		        if (rollsResult.get(rollNb) == Constants.STRIKESCORE) {
		        	frame = new Frame(Constants.STRIKESCORE, Constants.MISSEDSCORE);
		        	rollNb++;
		        } else {
		        	if (rollNb + 1 < rollsResult.size()) {
		        		frame = new Frame(rollsResult.get(rollNb), rollsResult.get(rollNb + 1));
		        	} else {
		        		//dernier lancer bonus
		        		frame = new Frame(rollsResult.get(rollNb), Constants.MISSEDSCORE);
		        	}
		        	rollNb += 2;
		        } 
		        if (frame.getframeScore() <= Constants.STRIKESCORE) {
		        	frameList.add(frame);
		        }  else {
		        	throw new Exception("Le score d'un frame ne peut pas dépasser 10.");
		        }
	    	} catch (Exception e) {
	    		throw e;
	    	} 
	    }
	    GameLine gameLine = new GameLine(frameList);
	    
	    return gameLine.getGameLineScore();
	}
	  
	public int getScoreOf(char roll) {
		if (roll == Constants.MISSED) {
			return Constants.MISSEDSCORE;
	    }
	    if (roll == Constants.STRIKE) {
	    	return Constants.STRIKESCORE;
	    }
	    return Character.getNumericValue(roll);
	}

	  
	public int getSpareScoreOf(char roll) {
	    if (roll == Constants.MISSED) {
	    	return Constants.STRIKESCORE;
	    }
	    return 10 - Character.getNumericValue(roll);
	}
}

