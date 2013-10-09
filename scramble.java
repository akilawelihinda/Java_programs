import java.util.Scanner;

public class scramble{
	public static void main(String[] args)
	{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter s to scramble or u to unscramble");
	String choice=input.next();
		if(choice.equals("s"))
		scramble();
		
		if(choice.equals("u"))
		unscramble();
	}
	
	public static void scramble()
	{
	Scanner input=new Scanner(System.in);
	System.out.println("enter message NO SPACES PLEASE:");
	String message=input.next();
	int startIndex=0;
	int endIndex=1;
	String messageScrambled="";
	
	String[] alphabet={"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", 
						"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", 
						"1", "2", "3", "4", "5", "6", "7", "8", "9"};
						
	String[] mixed={"1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", 
						"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
	
		while(endIndex<=message.length())
		{
			for(int x=0; x<alphabet.length; x++)
			{
				if((message.substring(startIndex, endIndex)).equals(alphabet[x]))
					messageScrambled+=mixed[x];
			}
			
			if(endIndex==alphabet.length){
				for(int x=0; x<alphabet.length; x++){
					if((message.substring(endIndex-1)).equals(alphabet[x]))
					messageScrambled+=mixed[x];
				}

			}
		startIndex++;
		endIndex++;
		}
	
	System.out.println(messageScrambled);
	}
	
	public static void unscramble()
	{
	Scanner input=new Scanner(System.in);
	System.out.println("enter message NO SPACES PLEASE:");
	String message=input.next();
	int startIndex=0;
	int endIndex=1;
	String messageUnscrambled="";
	
	String[] alphabet={"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", 
						"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", 
						"1", "2", "3", "4", "5", "6", "7", "8", "9", " ", "@", "."};
						
	String[] mixed={"1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", 
						"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", " ", "@", "."};
						
					while(endIndex<=message.length())
		{
			for(int x=0; x<alphabet.length; x++)
			{
				if((message.substring(startIndex, endIndex)).equals(mixed[x]))
					messageUnscrambled+=alphabet[x];
			}
			
			if(endIndex==alphabet.length){
				for(int x=0; x<alphabet.length; x++){
					if((message.substring(endIndex-1)).equals(mixed[x]))
					messageUnscrambled+=alphabet[x];
				}

			}
		startIndex++;
		endIndex++;
		}
	
	System.out.println(messageUnscrambled);
	}
}