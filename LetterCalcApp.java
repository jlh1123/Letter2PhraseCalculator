import java.util.*;
import java.lang.*;
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
		HashMap<Character, Integer> negativeMap = cal.getNegHash();
		System.out.println("size of negatives map: " + negativeMap.size());
		if(negativeMap.size() > 0)
		{
			view.printMsg("You cannot complete this phrase with the given amount of letters.");
			char a = 'a';
			for(int k = 0; k < 26; k++)
			{
				if(negativeMap.get(a) != null)
				{
					view.printNegatives(a, negativeMap.get(a));
				}
				a++;
			}
		}











	}//end main
}//end class
