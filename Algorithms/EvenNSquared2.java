import java.lang.Math;
class EvenNSquared2
{
	public static void main(String[] args)
	{
		int pow = 0;
		int res = 0;
		for(int i=0; i<=100; i++)
		{
			if(i%2 == 0)
			{
				res = res + (int)(Math.pow(i,2));
			}
		}
		System.out.println("Suma de cuadrados pares: " + res);
	}
}