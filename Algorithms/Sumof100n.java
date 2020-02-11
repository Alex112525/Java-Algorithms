class Sumof100n
{
	public static void main(String[] args)
	{
		int r = 0;
		for(int i=0; i<=100; i++)
		{
			r = r + i;
		}
		System.out.println(r);

		int j = 0;
		r = 0;
		while(j<=100)
		{
			r += j;
			j++;
		}
		System.out.print(r);
	}
}