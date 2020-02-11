class SumOfOdd100N
{
	public static void main(String[] args)
	{
		int res = 0;
		for(int i=0; i<=100; i++)
		{
			if(i%2 != 0)
			{
				res = res + i;
			}
		}
		System.out.println("Suma = " + res);
	}
}