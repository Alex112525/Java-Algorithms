import java.util.Scanner;

class TwoNumbersOp
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int knum = 0;
		int knum2 = 0;

		int sum, res, mul, div, cos;

		System.out.println("Introduce 2 numeros para hacer sus operaciones:");
		System.out.println("Numero 1: ");
		knum = key.nextInt();
		System.out.println("Numero 2: ");
		knum2 = key.nextInt();

		sum = knum + knum2;

		if(knum > knum2)
		{
			res = knum - knum2;
		}else
			{
				res = knum2 - knum;				
			}
		mul = knum * knum2;

		div = knum / knum2;

		cos = knum % knum2;

		System.out.print("Suma= " + sum + " Resta= " + res + " Multiplicacion= " + mul + " Division= " + div + " Cosiente= " + cos);
	}
}