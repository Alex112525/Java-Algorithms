class Fibonacci
{
	public static void main(String[] args)
	{
		int[] fib = new int[33];
		fib[0] = 0;
		fib[1] = 1;

		for(int i=1; i<32; i++)
		{
			fib[i+1] = fib[i] + fib[i-1];	
			System.out.println(i + " = " + fib[i+1]);
		}
	}
}