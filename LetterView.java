import java.util.*;
public class LetterView
{
	private Scanner sc;
	public LetterView()
	{
		sc = new Scanner(System.in);
	}

	public int getNumOfLetters()
	{
		System.out.print("How many of each letter do you want: ");
		return Integer.parseInt(sc.nextLine());

	}

	public String getMessage()
	{
		System.out.print("What message would you want to check?: ");
		String message = sc.nextLine();
		return message.toLowerCase();

	}

	public char getFirstCharacter(String passedMessage)
	{
		return passedMessage.charAt(0);
	}

	public void printMsg(String pMsg)
	{
		System.out.println(pMsg);
	}

	public void printNegatives(Character e, Integer p)
	{
		char d = e.toUppercase();
		System.out.println("\nYou lack: "+(p*-1)+" "+d+"\'s");
	}


}
