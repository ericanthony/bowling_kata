package kata;

public class Constants {
	protected static final String REGEX = "^((?:(?:(?:(?:-|[1-9])(?:-|[1-9]|\\/))|X){9}?)(?:(?:(?:-|[1-9])(?:(?:-|[1-9])|(?:\\/(?:-|[1-9]|X))))|(?:X(?:-|[1-9]|X){2}+)))$";
	  
	protected static final char MISSED = '-';
  
	protected static final char SPARE = '/';
  
	protected static final char STRIKE = 'X';
  
	protected static final int MISSEDSCORE = 0;
  
	protected static final int STRIKESCORE = 10;
}
