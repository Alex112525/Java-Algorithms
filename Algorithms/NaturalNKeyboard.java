import java.util.Scanner;

class NaturalNKeyboard
{
	public static void main(String[] args)
	{
		Scanner Key = new Scanner(System.in);

		int num = 0;
		System.out.println("Introduce un numero");
		num = Key.nextInt();

		for(int i=0; i<=num; i++)
		{
			System.out.print(i + " ");
		}

	}
}