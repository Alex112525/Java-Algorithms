import java.lang.Math;

class SquaredAndCubeN
{
	public static void main(String[] args)
	{
		System.out.println("Numero:  Cuadrado:  Cubo: ");
		for(int i=1; i<=10; i++)
		{
			System.out.println( i + "          " + Math.pow(i,2) + "         " + Math.pow(i,3));
		}
	}
}