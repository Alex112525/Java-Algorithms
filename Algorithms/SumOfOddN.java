class SumOfOddN
{
	public static void main(String[] args)
	{
		int res = 0;
		for(int i=100; i>=1; i--)
		{
			if(i%2 != 0)
			{
				res = res + i;
				System.out.print(i + " ");
			}
		}
		System.out.println(res);

		int j = 100;
		res = 0;
		while(j>=1)
		{
			if(j%2 != 0)
			{
				res += j;
				System.out.print(j + " ");
			}
			j--;
		}
		System.out.println(res);
	}
}