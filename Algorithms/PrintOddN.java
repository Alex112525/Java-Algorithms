class PrintOddN
{
	public static void main(String[] args)
	{
		int count = 0;
		int res = 0;
		for(int i=0; i<=100; i++)
		{
			if(i%2 != 0)
			{
				System.out.print(i + " ");
				count ++;
			}
		}
		System.out.println(count);

		count = 0;
		int j = 0;
		while(j <= 100)
		{
			if(j%2 != 0)
			{
				System.out.print(j + " ");
				count++;
			}
			j++;
		}
		System.out.print(count);
	}
}