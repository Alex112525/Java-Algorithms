import java.util.Scanner;

class SumOfNExceptMulplesOf5
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int numk = 0;
		int sum = 0;
		int sum5 = 0;

		System.out.println("Ingresa un numero: ");
		numk = key.nextInt();

		for(int i=0; i<numk; i++)
		{
			if(i%5 == 0)
			{
				sum5 += i;
			}else 
				{
					System.out.print(i + " ");
					sum += i;						
				}
		}
		System.out.println("Suma de numeros multiplos de 5 = " + sum5);
		System.out.println("Suma de numeros no multiplos de 5 =" + sum);
	}
}