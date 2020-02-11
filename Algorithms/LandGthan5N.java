import java.util.Scanner;
import java.io.*;

class LandGthan5N
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int[] num = new int[5];
		int Gt = 0;
		int Lt = 0;

		for(int i=0; i<5; i++)
		{
			System.out.print("Introdusca Numero "+ (i+1) + ":");
			num[i] = key.nextInt();
		}
		Lt = num[0];
		for(int i=0; i<num.length; i++)
		{
			if(num[i] > Gt)
			{
				Gt = num[i]; 
			}
			if(num[i] < Lt)
			{
				Lt = num[i];
			}
		}
		System.out.println("Greater number = " + Gt + "  Lower number = " + Lt);
	}
}