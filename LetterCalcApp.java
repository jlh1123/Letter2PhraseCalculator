import java.util.*;
public class LetterCalcApp 
{
	public static void main(String[] args)
	{
		LetterView view = new LetterView();
		String msg = view.getMessage();
		int x = view.getNumOfLetters();
		LetterCalculator cal = new LetterCalculator(x);
		
		for(int i = 0; i < msg.length(); i++)
		{
			String s = msg.substring(i, (i+1));
			char c = view.getFirstCharacter(s);
			cal.decreaseLetter(c);
			
		}
		
		
		
		
		
		
		
		
	}//end main
}//end class
