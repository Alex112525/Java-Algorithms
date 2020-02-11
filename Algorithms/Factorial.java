import java.util.Scanner;

class Factorial
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int knum = 0;
		int res = 1;

		System.out.println("Introduce un numero para sacar factorial");
		knum = key.nextInt();

		for(int i=knum; i>0; i--)
		{
			res = res * i;
			System.out.println(i);
		}

		System.out.println("El factorialde tu numero es: " + res);
	}
}