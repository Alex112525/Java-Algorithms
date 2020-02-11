import java.util.Scanner;

class SuccessiveSubtractions
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int dividendo = 0; 
		int divisor = 0;
		int cociente = 0;

		System.out.println("Division por restas sucesivas: ");
		System.out.println(" Introduce el numero a dividir:");
		dividendo = key.nextInt();
		System.out.println("Introduce el numero divisor:");
		divisor = key.nextInt();

		while(dividendo > divisor)
		{
			dividendo = dividendo - divisor;
			cociente++;
		}
		System.out.print("Cociente = " + cociente + " Residuo= " + dividendo);
	}
}