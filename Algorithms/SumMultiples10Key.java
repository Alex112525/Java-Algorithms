import java.util.Scanner;

class SumMultiples10Key
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int num = 0;
		int count = 0;
		int res = 0;

		System.out.print("Ingresa un numero: ");
		num = key.nextInt();

		for(int i=0; i<=num; i++)
		{
			if(i%10 == 0)
			{
				System.out.print(i + " ");
				count ++;
				res = res + i;
			}
		}
		System.out.println("Suma = " + res);
		System.out.println("Total= " + count);
	}
}