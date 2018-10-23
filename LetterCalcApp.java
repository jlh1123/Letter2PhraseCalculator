/*
*Author: Jesus L. H.
*/

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
		HashMap<Character, Integer> normalMap = cal.getHash();
		HashMap<Character, Integer> negativeMap = cal.getNegHash();
		if(negativeMap.size() > 0)
		{
			view.printMsg("\nYou cannot complete this phrase with the given amount of letters.");
			char a = 'a';
			for(int k = 0; k < 26; k++)
			{
				if(negativeMap.get(a) != null)
				{
					view.printNegatives(a, negativeMap.get(a));
				}
				a++;
			}
		}//end if
		else
		{
			view.printMsg("\nYou can complete this phrase with the given amount of letters.");
			view.printMsg("\nOf the letters you haved used, you have this many characters remaining:");
			char a = 'a';
			for(int n = 0; n < 26; n++)
			{
				if(normalMap.get(a) != null && normalMap.get(a) != x)
				{
					view.printPositives(a, normalMap.get(a));
				}
				a++;
			}
		}//end else


	}//end main
}//end class
