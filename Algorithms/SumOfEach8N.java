class SumOfEach8N
{
	public static void main(String[] args)
	{
		int res = 0;
		int count = 0;
		for(int i=0; i<=500; i = i+8)
		{
			System.out.print(i + " ");
			res = res + i;
			count++;
		}
		System.out.println("Total = " + count);
		System.out.println("Suma = " + res);
	}
}