import java.util.*;
import java.lang.reflect.Field;
public class LetterCalculator
{
	private int numA;
	private int numB;
	private int numC;
	private int numD;
	private int numE;
	private int numF;
	private int numG;
	private int numH;
	private int numI;
	private int numJ;
	private int numK;
	private int numL;
	private int numM;
	private int numN;
	private int numO;
	private int numP;
	private int numQ;
	private int numR;
	private int numS;
	private int numT;
	private int numU;
	private int numV;
	private int numW;
	private int numX;
	private int numY;
	private int numZ;

	public LetterCalculator(int amount)
	{
		numA = amount;
		numB = amount;
		numC = amount;
		numD = amount;
		numE = amount;
		numF = amount;
		numG = amount;
		numH = amount;
		numI = amount;
		numJ = amount;
		numK = amount;
		numL = amount;
		numM = amount;
		numN = amount;
		numO = amount;
		numP = amount;
		numQ = amount;
		numR = amount;
		numS = amount;
		numT = amount;
		numU = amount;
		numV = amount;
		numW = amount;
		numX = amount;
		numY = amount;
		numZ = amount;
	}
	HashMap<Character, Integer> mapList = new HashMap<Character, Integer>();
	HashMap<Character, Integer> negList = new HashMap<Character, Integer>();
	public void decreaseLetter(char c)
	{
		switch(c)
		{
		case 'a':
			numA--;
			mapList.put(c, numA);
			if(numA < 0)
			{
				negList.put(c, numA);
			}
			break;

		case 'b':
			numB--;
			mapList.put(c, numB);
			if(numB < 0)
			{
				negList.put(c, numB);
			}
			break;

		case 'c':
			numC--;
			mapList.put(c, numC);
			if(numC < 0)
			{
				negList.put(c, numC);
			}
			break;

		case 'd':
			numD--;
			mapList.put(c, numD);
			if(numD < 0)
			{
				negList.put(c, numD);
			}
			break;

		case 'e':
			numE--;
			mapList.put(c, numE);
			if(numE < 0)
			{
				negList.put(c, numE);
			}
			break;

		case 'f':
			numF--;
			mapList.put(c, numF);
			if(numF < 0)
			{
				negList.put(c, numF);
			}
			break;

		case 'g':
			numG--;
			mapList.put(c, numG);
			if(numG < 0)
			{
				negList.put(c, numG);
			}
			break;

		case 'h':
			numH--;
			mapList.put(c, numH);
			if(numH < 0)
			{
				negList.put(c, numH);
			}
			break;

		case 'i':
			numI--;
			mapList.put(c, numI);
			if(numI < 0)
			{
				negList.put(c, numI);
			}
			break;

		case 'j':
			numJ--;
			mapList.put(c, numJ);
			if(numJ < 0)
			{
				negList.put(c, numJ);
			}
			break;

		case 'k':
			numK--;
			mapList.put(c, numK);
			if(numK < 0)
			{
				negList.put(c, numK);
			}
			break;

		case 'l':
			numL--;
			mapList.put(c, numL);
			if(numL < 0)
			{
				negList.put(c, numL);
			}
			break;

		case 'm':
			numM--;
			mapList.put(c, numM);
			if(numM < 0)
			{
				negList.put(c, numM);
			}
			break;

		case 'n':
			numN--;
			mapList.put(c, numN);
			if(numN < 0)
			{
				negList.put(c, numN);
			}
			break;

		case 'o':
			numO--;
			mapList.put(c, numO);
			if(numO < 0)
			{
				negList.put(c, numO);
			}
			break;

		case 'p':
			numP--;
			mapList.put(c, numP);
			if(numP < 0)
			{
				negList.put(c, numP);
			}
			break;

		case 'q':
			numQ--;
			mapList.put(c, numQ);
			if(numQ < 0)
			{
				negList.put(c, numQ);
			}
			break;

		case 'r':
			numR--;
			mapList.put(c, numR);
			if(numR < 0)
			{
				negList.put(c, numR);
			}
			break;

		case 's':
			numS--;
			mapList.put(c, numS);
			if(numS < 0)
			{
				negList.put(c, numS);
			}
			break;

		case 't':
			numT--;
			mapList.put(c, numT);
			if(numT < 0)
			{
				negList.put(c, numT);
			}
			break;

		case 'u':
			numU--;
			mapList.put(c, numU);
			if(numU < 0)
			{
				negList.put(c, numU);
			}
			break;

		case 'v':
			numV--;
			mapList.put(c, numV);
			if(numV < 0)
			{
				negList.put(c, numV);
			}
			break;
		case 'w':
			numW--;
			mapList.put(c, numW);
			if(numW < 0)
			{
				negList.put(c, numW);
			}
			break;

		case 'x':
			numX--;
			mapList.put(c, numX);
			if(numX < 0)
			{
				negList.put(c, numX);
			}
			break;

		case 'y':
			numY--;
			mapList.put(c, numY);
			if(numY < 0)
			{
				negList.put(c, numY);
			}
			break;

		case 'z':
			numZ--;
			mapList.put(c, numZ);
			if(numZ < 0)
			{
				negList.put(c, numZ);
			}
			break;

		}//end switch case

	}//end decrease letter

	public HashMap<Character, Integer> getHash()
	{
		return mapList;
	}

	public HashMap<Character, Integer> getNegHash()
	{
		return negList;
	}















}//end class
