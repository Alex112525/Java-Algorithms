import java.util.Scanner;
import java.lang.Math;

class Squared2Each4N
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int res = 0;
		int num = 0;

		System.out.println("Introduce un numero:");
		num = key.nextInt();

		for(int i=0; i<=num; i+=4)
		{
			 res = res + (int)(Math.pow(i,2));
			 System.out.print(i + " ");
		}
		System.out.println("Suma de cuadrados cada 4 numeros= " + res);
	}
}