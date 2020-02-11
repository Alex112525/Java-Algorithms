import java.util.Scanner;

class NMultipleOfOther
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int knum1, knum2;

		System.out.println("Introduce 2 numeros para saber si uno es multiplo del otro");
		System.out.println("Introduce primer numero:");
		knum1 = key.nextInt();
		System.out.println("Introduce segundo numero:");
		knum2 = key.nextInt();

		if(knum1%knum2 == 0)
		{
			System.out.println("El numero: " + knum1 + " es multiplo de: " + knum2);
		}else
			{
				System.out.println("El numero no es multiplo.");			
			}


	}
}