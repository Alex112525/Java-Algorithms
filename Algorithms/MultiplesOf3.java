class MultiplesOf3
{
	public static void main(String[] args)
	{
		int count = 0;
		for(int i=0; i<=100; i++)
		{
			if(i%3 == 0)
			{
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("Total: " + count);
	}
}