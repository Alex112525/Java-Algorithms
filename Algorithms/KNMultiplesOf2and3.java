import java.util.Scanner;

class KNMultiplesOf2and3
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int numk = 0;
		int count = 0;

		System.out.println("Introduce el numero final de tu secuencia:");
		numk = key.nextInt();

		for(int i=1; i<numk; i++)
		{
			if(i%2 == 0 && i%3 ==0)
			{
				count++;
				System.out.print(i + " ");
			}
		}
		System.out.print("Numeros multiplos de 2 y 3 = " + count);
	}
}