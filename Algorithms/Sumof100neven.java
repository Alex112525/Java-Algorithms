class sumof100neven
{
	public static void main(String[] args)
	{
		int r = 0;
		for (int i=0; i<=100; i++)
		{
			if(i%2 == 0)
			{
				r = r + i;
			}	
		}
		System.out.println(r);

		r = 0;
		int j = 0;
		while(j <= 100)
		{
			if(j%2 == 0)
			{
				r += j;
			}
			j++;
		}
		System.out.println(r);
	}
}