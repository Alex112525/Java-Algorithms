import java.util.Scanner;

class Circle
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		double knum;
		double cDia, per, area;
		final double pi = 3.14159;

		System.out.println("Introduce el radio de tu ciculo:");
		knum = key.nextInt();

		cDia = knum * 2;

		per = cDia * pi;

		area = pi * knum * knum;

		System.out.println("Diametro: " + cDia + " Perimetro: " + per + " Area: " + area);
	}
}