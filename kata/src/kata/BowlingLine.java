package kata;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class BowlingLine {
	
	public static void main(String[] args) {
		String sequence = "XXXXXXXXXXXX";
	    String sequence2 = "9-9-9-9-9-9-9-9-9-9-";
	    String sequence3 = "5/5/5/5/5/5/5/5/5/5/5";
	    
	    Pattern pattern = Pattern.compile(Constants.REGEX);
	    Matcher matcher = pattern.matcher(sequence);
	    if (matcher.matches()) {
	    	String line = matcher.group(1);
	    	LineParse lineParse = new LineParse(line);
	    	try {
	    		System.out.println("Ligne : " + sequence);
	    		System.out.println("Score : " + lineParse.getLineScore());
	    	} catch (Exception e) {
	    		System.out.println(e.getMessage());
	    	} 
	    } else {  
	      System.out.println("La séquence n'est pas valide");
	    } 
	}
}