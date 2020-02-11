class Vector
{
	public static void main(String[] args)
	{
		int[] v = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}; 
		int r = 0;

		for(int k=0; k<20; k++)
		{
			r = v[0]; 
	 		for(int i=0; i<19; i++)
	 		{		
				v[i] = v[i+1];
			}

			v[19] = r;

			for(int j=0; j<20; j++)
			{
				System.out.print(v[j] + "  ");
			}
		System.out.println(" ");
		}
	}
}