class Sorting
{
	void insertionsort(int a1[])
	{
		int n = a1.length;

		for(int i = 1; i < n; i++)
		{
			int k = a1[i];

			int j = i - 1;

			while(j >= 0 && a1[j] > k)
			{
				a1[j+1] = a1[j];
				
				j = j - 1;
				
				display(a1);

			}
			
			a1[j+1] = k;

			display(a1);

		}
		
	}

	void display(int a1[])
	{

		int n = a1.length;

		for(int i = 0; i < n; i++)
			System.out.print(a1[i]+" ");
		
		System.out.println();
	}

	public static void main(String args[])
	{
		Sorting s = new Sorting();

		int a1[] = {2,4,6,8,3};

		s.insertionsort(a1);
	}
}
			 
			
