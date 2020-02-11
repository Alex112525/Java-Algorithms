import java.util.Scanner;

class ThreeNOp
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int num1, num2, num3;
		int sum, mArit;
		int mayor, menor;

		System.out.println("Introduce 3 numeros para hacer las operaciones");
		System.out.println("Numero 1");
		num1 = key.nextInt();

		System.out.println("Numero 2");
		num2 = key.nextInt();

		if(num1 < num2)
		{
			menor = num1;
			mayor = num2;
		}else 
			{
				menor = num2;
				mayor =  num1;
			}

		System.out.println("Numero 3");
		num3 = key.nextInt();

		if(num3 > mayor)
		{
			mayor = num3;
		}else 
			{
				menor = num3;				
			}

		sum = num1 + num2 + num3;
		mArit = sum/3;

		System.out.println("Suma=" + sum + " Media Aritmetica= " + mArit + " No mayor= " + mayor + "No menor" + menor); 


	}
}