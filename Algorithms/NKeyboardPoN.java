import java.util.Scanner;
import java.lang.Math;

class NKeyboardPoN
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int num = 0;

		System.out.println("Introduce un numero positivo o negativo");
		num = key.nextInt();

		if(num >= 0)
		{
			System.out.print("El numero es positivo ");
		}else if(num < 0)
			{
				System.out.print("El numero es negativo ");
			}
		num = Math.abs(num);

		if(num%2 == 0)
		{
			System.out.println("y es par.");
		}else
			{
				System.out.println("y es impar");
			}
	}
}