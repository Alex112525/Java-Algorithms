class MultiplesOf5
{
	public static void main(String[] args)
	{
		int count = 0;
		for(int i=0; i<=500; i++)
		{
			if(i%5 == 0)
			{
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("Total=" + count);
	}
}