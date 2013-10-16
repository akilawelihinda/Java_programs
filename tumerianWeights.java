/*
Ternarian Weights
Problem ID: ternarianweights

Back in the Hellenic era, there was a small island in the Mediterranean Sea known as Ternaria. It was close to
Sparta, but because of its mountainous terrain the Spartans found it difficult to conquer and it remained an independent
state until the great earthquake of 729BC when it sank beneath the sea. It had a remarkable civilization and some
modern historians think it is the basis for the mythological city of Atlantis. Ternaria is still known for its fundamental
contributions to science and mathematics, many of which were adopted by the Greeks and later by the Romans. For
example, Ternarians were the first group to use the standard weight of pounds, which we still use today. Ternarian
mathematics used base 3 for all its calculations. (Historians speculate that this was out of respect for King Ternary
who lost two fingers on each hand while battling the Spartans.)

Ternarian trade scales were a standard for many centuries. They were known for their accuracy and ease of use.
They were the first to construct a scale with weighing pans on each side and a fulcrum in the middle. The object to be
weighed was placed on the left side of the scale and weights were placed on both sides, until balance was obtained.
This sounds strange by modern standards, because typically on modern scales we would only place weights on the
right side. However, the modern method requires additional weights. The Ternarian method only requires one weight
for each power of three pounds, e.g. one weight of 1 pound, one weight of 3 pounds, one weight of 9 pounds, etc.
Say you are weighing a 2-pound Ternarian hen (known for their succulent white meat). You place the hen on the
left side. Place the 3-pound weight on the right side. This is too heavy, so you place the 1-pound weight with the hen
on the left side to achieve balance. Note that the sum of the weights on the right side minus the sum of the weights on
the left side equals the weight of the object.

As another example, consider weighing a 21-pound Ternarian squash. Using the Ternarian system, you would
place weights of 27 pounds and 3 pounds in the right pan and a weight of 9 pounds in the left pan (along with the
object) again achieving balance.

Write a program that accepts as input the weight of an object in base 10 and outputs the weights to be placed in
both pans.

Input:
Enter a number which will describe how many pounds are on the left side of the scale.

Output:
The output will tell you how which weights should be added to the right side and the left side in order to balance out the scale.
*/
import java.util.Scanner;

public class weights{
	public static void main(String[] args)
	{
	Scanner input=new Scanner(System.in);
	int weight;
	weight=input.nextInt();
	System.out.println(getAnswer(weight));
	}

public static String getAnswer(int weights)
{
String leftStr="left:";
String rightStr="right:";
int left=weights;
int right=0;
int border=0;
while(left!=right)
{
border=(int)(Math.log(Math.abs(left-right))/Math.log(3)+0.5);

	if(right>left)
	{
		left=left+(int)Math.pow(3, border);
		leftStr=leftStr+" "+(int)Math.pow(3, border);
	}
	
	else
	{
		right=right+(int)Math.pow(3, border);
		rightStr=rightStr+" "+(int)Math.pow(3, border);
	}
	
}
return rightStr+"\n"+leftStr;
}
}

