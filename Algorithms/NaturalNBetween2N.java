import java.util.Scanner;

class NaturalNBetween2N
{
	public static void main(String[] args)
	{
		int n1 = 0;
		int n2 = 0;
		int sum = 0;
		int count = 0;
		Scanner key = new Scanner(System.in);
		System.out.println("Introduce el primer numero de tu secuencia:");
		n1 = key.nextInt();
		System.out.println("Introduce el ultimo numero de la secuencia");
		n2 = key.nextInt();

		for(int i = n1; i<=n2; i++)
		{
			System.out.print(i + " ");
			if(i%2 != 0)
			{
				sum += i;
			}
			if(i%2 == 0)
			{
				count++;
			}
		}
		System.out.println("Suma de numers impares = " + sum);
		System.out.println("Cantidad de numeros pares = " + count);
	}
}