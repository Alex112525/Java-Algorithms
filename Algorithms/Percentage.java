import java.util.Scanner;

class Percentage
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);

		int numk = 0;
		double res = 0;

		System.out.print("Introduce una cantidad:");
		numk = key.nextInt();

		if(numk < 500)
		{	
			res = numk * 1.5;
			System.out.print("50% agregado = " + res);
		}else if(numk >= 500 && numk <1000)
			{
				res = numk * 1.07;
				System.out.print(" 7% agregado = " + res);
			}else if( numk >= 1000 && numk <=5000)
				{
					res = numk * 0.95; 
					System.out.print("Menos 5 porciento = " + res);
				}else
					{
						System.out.print("No se hizo nada :)");
					}
	}	
}