import java.util.Scanner;

class SuccessiveSum
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int knum1, knum2;
		int sum = 0;

		System.out.println("Introdusca dos nuemeros para multiplicarlos");
		System.out.println("Numero 1:");
		knum1 = key.nextInt();

		System.out.println("Numero 2:");
		knum2 = key.nextInt();

		for(int i=0; i<knum2; i++)
		{
			sum += knum1;
		}

		System.out.println("Resultado: " + sum);
	}
}