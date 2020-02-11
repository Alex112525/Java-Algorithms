import java.util.Scanner;
import java.lang.Math;

class NtoBinary
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		double knum = 0;
		double exp = 0;
		double bin = 0;
		double bin2 = 0;

		System.out.println("Ingresa un numero para convertirlo a binario solo 10 bit");
		knum = key.nextDouble();


		for(int i=20; i>=0; i--)
		{
			if(knum >= Math.pow(2,i))
			{
				if(knum < 1023)
				{
					knum = knum - Math.pow(2,i);
					bin = bin + Math.pow(10, i);
					System.out.println(Math.pow(2,i));
				}else
					{
						knum = knum - Math.pow(2,i);
						bin2 = bin2 + Math.pow(10, i - 10);
						System.out.println(Math.pow(2,i));
					}
			}
		}

		System.out.println("Binario = "+ (int)bin2 + (int)bin);
	}
}