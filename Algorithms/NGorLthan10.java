import java.util.Scanner;

class NGorLthan10
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int num = 0;
		int[] numbers;
		int Gt10 = 0;
		int Lt10 = 0;
		System.out.println("Cuantos numeros deseeas Ingresar:");
		num = key.nextInt();

		numbers = new int[num];

		for(int i=0; i<num; i++)
		{
			System.out.println("Ingeresa numero " + (i+1) + ":");
			numbers[i] = key.nextInt();
		}

		for(int i=0; i<numbers.length; i++)
		{
			if(numbers[i] > 10)
			{
				Gt10++;
			}else 
				{
					Lt10++;			
				}
		}
		System.out.println("Numbers Greater than 10 = " + Gt10);
		System.out.println("Numbers Lower than 10 = " + Lt10);
	}
}