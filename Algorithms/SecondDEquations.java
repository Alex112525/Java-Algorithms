import java.util.Scanner;
import java.lang.Math;

class SecondDEquations
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int a,b,c;
		double sol1 = 0; 
		double sol2 = 0;
		double raiz = 0;
		double r;

		System.out.println("Introduce los valores de tu ecuacion ax^2 + bx + c = 0:");
		System.out.println("Introduce a:");
		a = key.nextInt();
		System.out.println("Introduce b:");
		b = key.nextInt();
		System.out.println("Introduce c:");
		c = key.nextInt();

		r = ((b*b) - (4*a*c));

		if(r > 0)
		{
			raiz = Math.sqrt(r);

			sol1 = ((-1)*(b) + raiz) / (2 * a);
			sol2 = ((-1)*(b) - raiz) / (2 * a);

			System.out.println("Solucion 1 = " + sol1 );
			System.out.println("Solucion 2 = " + sol2 );
		}else if(r == 0)
			{
				sol1 = ((-1)*(b)) / (2 * a);
				
				System.out.println("Solucion = " + sol1 );
			}else
				{
					System.out.println("La ecuacion no tiene solucion.");			
				}
	}
}